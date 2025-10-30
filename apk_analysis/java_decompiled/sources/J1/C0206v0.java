package J1;

import android.util.SparseIntArray;
import androidx.lifecycle.InterfaceC0561w;
import co.notix.R;

/* renamed from: J1.v0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0206v0 extends AbstractC0204u0 {

    /* renamed from: F, reason: collision with root package name */
    public static final android.support.v4.media.session.y f4114F;

    /* renamed from: G, reason: collision with root package name */
    public static final SparseIntArray f4115G;

    /* renamed from: E, reason: collision with root package name */
    public long f4116E;

    static {
        android.support.v4.media.session.y yVar = new android.support.v4.media.session.y(11);
        f4114F = yVar;
        yVar.X(0, new int[]{1}, new int[]{R.layout.layout_loading}, new String[]{"layout_loading"});
        SparseIntArray sparseIntArray = new SparseIntArray();
        f4115G = sparseIntArray;
        sparseIntArray.put(R.id.buttonBack, 2);
        sparseIntArray.put(R.id.searchView, 3);
        sparseIntArray.put(R.id.buttonClear, 4);
        sparseIntArray.put(R.id.buttonFilter, 5);
        sparseIntArray.put(R.id.layoutEmpty, 6);
        sparseIntArray.put(R.id.textTitleTopSearch, 7);
        sparseIntArray.put(R.id.recyclerResult, 8);
        sparseIntArray.put(R.id.recyclerTopSearch, 9);
        sparseIntArray.put(R.id.loadingLoadMore, 10);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C0206v0(android.view.View r15) {
        /*
            r14 = this;
            android.support.v4.media.session.y r0 = J1.C0206v0.f4114F
            android.util.SparseIntArray r1 = J1.C0206v0.f4115G
            r2 = 11
            java.lang.Object[] r0 = W.g.g0(r15, r2, r0, r1)
            r1 = 2
            r1 = r0[r1]
            r5 = r1
            androidx.appcompat.widget.AppCompatImageView r5 = (androidx.appcompat.widget.AppCompatImageView) r5
            r1 = 4
            r1 = r0[r1]
            r6 = r1
            androidx.appcompat.widget.AppCompatImageView r6 = (androidx.appcompat.widget.AppCompatImageView) r6
            r1 = 5
            r1 = r0[r1]
            r7 = r1
            com.google.android.material.button.MaterialButton r7 = (com.google.android.material.button.MaterialButton) r7
            r1 = 6
            r1 = r0[r1]
            r8 = r1
            androidx.appcompat.widget.LinearLayoutCompat r8 = (androidx.appcompat.widget.LinearLayoutCompat) r8
            r1 = 1
            r1 = r0[r1]
            r9 = r1
            J1.E1 r9 = (J1.E1) r9
            r1 = 10
            r1 = r0[r1]
            r10 = r1
            com.google.android.material.progressindicator.LinearProgressIndicator r10 = (com.google.android.material.progressindicator.LinearProgressIndicator) r10
            r1 = 8
            r1 = r0[r1]
            r11 = r1
            androidx.recyclerview.widget.RecyclerView r11 = (androidx.recyclerview.widget.RecyclerView) r11
            r1 = 9
            r1 = r0[r1]
            r12 = r1
            androidx.recyclerview.widget.RecyclerView r12 = (androidx.recyclerview.widget.RecyclerView) r12
            r1 = 3
            r1 = r0[r1]
            r13 = r1
            androidx.appcompat.widget.AppCompatEditText r13 = (androidx.appcompat.widget.AppCompatEditText) r13
            r1 = 7
            r1 = r0[r1]
            androidx.appcompat.widget.AppCompatTextView r1 = (androidx.appcompat.widget.AppCompatTextView) r1
            r3 = 0
            r2 = r14
            r4 = r15
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            r5 = -1
            r2.f4116E = r5
            J1.E1 r15 = r2.f4105z
            if (r15 == 0) goto L58
            r15.f7858p = r2
        L58:
            r15 = 0
            r15 = r0[r15]
            androidx.constraintlayout.widget.ConstraintLayout r15 = (androidx.constraintlayout.widget.ConstraintLayout) r15
            r0 = 0
            r15.setTag(r0)
            r14.j0(r4)
            r14.e0()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: J1.C0206v0.<init>(android.view.View):void");
    }

    @Override // W.g
    public final void a0() {
        synchronized (this) {
            this.f4116E = 0L;
        }
        this.f4105z.b0();
    }

    @Override // W.g
    public final boolean d0() {
        synchronized (this) {
            try {
                if (this.f4116E != 0) {
                    return true;
                }
                if (this.f4105z.d0()) {
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
            this.f4116E = 2L;
        }
        this.f4105z.e0();
        h0();
    }

    @Override // W.g
    public final void i0(InterfaceC0561w interfaceC0561w) {
        super.i0(interfaceC0561w);
        this.f4105z.i0(interfaceC0561w);
    }
}
