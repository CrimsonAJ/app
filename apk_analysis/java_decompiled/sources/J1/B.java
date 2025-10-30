package J1;

import android.util.SparseIntArray;
import androidx.lifecycle.InterfaceC0561w;
import co.notix.R;

/* loaded from: classes.dex */
public final class B extends A {

    /* renamed from: D, reason: collision with root package name */
    public static final android.support.v4.media.session.y f3612D;

    /* renamed from: E, reason: collision with root package name */
    public static final SparseIntArray f3613E;

    /* renamed from: C, reason: collision with root package name */
    public long f3614C;

    static {
        android.support.v4.media.session.y yVar = new android.support.v4.media.session.y(9);
        f3612D = yVar;
        yVar.X(0, new int[]{1}, new int[]{R.layout.layout_loading}, new String[]{"layout_loading"});
        SparseIntArray sparseIntArray = new SparseIntArray();
        f3613E = sparseIntArray;
        sparseIntArray.put(R.id.buttonBack, 2);
        sparseIntArray.put(R.id.textTitleCategory, 3);
        sparseIntArray.put(R.id.buttonSearch, 4);
        sparseIntArray.put(R.id.layoutEmpty, 5);
        sparseIntArray.put(R.id.refreshLayout, 6);
        sparseIntArray.put(R.id.recyclerMovies, 7);
        sparseIntArray.put(R.id.loadingLoadMore, 8);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public B(android.view.View r13) {
        /*
            r12 = this;
            android.support.v4.media.session.y r0 = J1.B.f3612D
            android.util.SparseIntArray r1 = J1.B.f3613E
            r2 = 9
            java.lang.Object[] r0 = W.g.g0(r13, r2, r0, r1)
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
            androidx.appcompat.widget.LinearLayoutCompat r1 = (androidx.appcompat.widget.LinearLayoutCompat) r1
            r1 = 1
            r1 = r0[r1]
            r7 = r1
            J1.E1 r7 = (J1.E1) r7
            r1 = 8
            r1 = r0[r1]
            r8 = r1
            com.google.android.material.progressindicator.LinearProgressIndicator r8 = (com.google.android.material.progressindicator.LinearProgressIndicator) r8
            r1 = 7
            r1 = r0[r1]
            r9 = r1
            androidx.recyclerview.widget.RecyclerView r9 = (androidx.recyclerview.widget.RecyclerView) r9
            r1 = 6
            r1 = r0[r1]
            r10 = r1
            androidx.swiperefreshlayout.widget.SwipeRefreshLayout r10 = (androidx.swiperefreshlayout.widget.SwipeRefreshLayout) r10
            r1 = 3
            r1 = r0[r1]
            r11 = r1
            androidx.appcompat.widget.AppCompatTextView r11 = (androidx.appcompat.widget.AppCompatTextView) r11
            r3 = 0
            r2 = r12
            r4 = r13
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11)
            r5 = -1
            r2.f3614C = r5
            J1.E1 r13 = r2.f3605x
            if (r13 == 0) goto L4a
            r13.f7858p = r2
        L4a:
            r13 = 0
            r13 = r0[r13]
            androidx.constraintlayout.widget.ConstraintLayout r13 = (androidx.constraintlayout.widget.ConstraintLayout) r13
            r0 = 0
            r13.setTag(r0)
            r12.j0(r4)
            r12.e0()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: J1.B.<init>(android.view.View):void");
    }

    @Override // W.g
    public final void a0() {
        synchronized (this) {
            this.f3614C = 0L;
        }
        this.f3605x.b0();
    }

    @Override // W.g
    public final boolean d0() {
        synchronized (this) {
            try {
                if (this.f3614C != 0) {
                    return true;
                }
                if (this.f3605x.d0()) {
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
            this.f3614C = 2L;
        }
        this.f3605x.e0();
        h0();
    }

    @Override // W.g
    public final void i0(InterfaceC0561w interfaceC0561w) {
        super.i0(interfaceC0561w);
        this.f3605x.i0(interfaceC0561w);
    }
}
