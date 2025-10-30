package J1;

import android.util.SparseIntArray;
import co.notix.R;

/* loaded from: classes.dex */
public final class M extends L {

    /* renamed from: C, reason: collision with root package name */
    public static final SparseIntArray f3717C;

    /* renamed from: B, reason: collision with root package name */
    public long f3718B;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f3717C = sparseIntArray;
        sparseIntArray.put(R.id.buttonBack, 1);
        sparseIntArray.put(R.id.textTitleSortAndFilter, 2);
        sparseIntArray.put(R.id.recyclerFilter, 3);
        sparseIntArray.put(R.id.buttonFilter, 4);
        sparseIntArray.put(R.id.refreshLayout, 5);
        sparseIntArray.put(R.id.recyclerMovies, 6);
        sparseIntArray.put(R.id.loadingLoadMore, 7);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public M(android.view.View r13) {
        /*
            r12 = this;
            android.util.SparseIntArray r0 = J1.M.f3717C
            r1 = 8
            r2 = 0
            java.lang.Object[] r0 = W.g.g0(r13, r1, r2, r0)
            r1 = 1
            r1 = r0[r1]
            r6 = r1
            androidx.appcompat.widget.AppCompatImageView r6 = (androidx.appcompat.widget.AppCompatImageView) r6
            r1 = 4
            r1 = r0[r1]
            r7 = r1
            com.google.android.material.button.MaterialButton r7 = (com.google.android.material.button.MaterialButton) r7
            r1 = 7
            r1 = r0[r1]
            r8 = r1
            com.google.android.material.progressindicator.LinearProgressIndicator r8 = (com.google.android.material.progressindicator.LinearProgressIndicator) r8
            r1 = 3
            r1 = r0[r1]
            r9 = r1
            androidx.recyclerview.widget.RecyclerView r9 = (androidx.recyclerview.widget.RecyclerView) r9
            r1 = 6
            r1 = r0[r1]
            r10 = r1
            androidx.recyclerview.widget.RecyclerView r10 = (androidx.recyclerview.widget.RecyclerView) r10
            r1 = 5
            r1 = r0[r1]
            r11 = r1
            androidx.swiperefreshlayout.widget.SwipeRefreshLayout r11 = (androidx.swiperefreshlayout.widget.SwipeRefreshLayout) r11
            r1 = 2
            r1 = r0[r1]
            androidx.appcompat.widget.AppCompatTextView r1 = (androidx.appcompat.widget.AppCompatTextView) r1
            r4 = 0
            r3 = r12
            r5 = r13
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11)
            r6 = -1
            r3.f3718B = r6
            r13 = 0
            r13 = r0[r13]
            androidx.constraintlayout.widget.ConstraintLayout r13 = (androidx.constraintlayout.widget.ConstraintLayout) r13
            r13.setTag(r2)
            r12.j0(r5)
            r12.e0()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: J1.M.<init>(android.view.View):void");
    }

    @Override // W.g
    public final void a0() {
        synchronized (this) {
            this.f3718B = 0L;
        }
    }

    @Override // W.g
    public final boolean d0() {
        synchronized (this) {
            try {
                if (this.f3718B != 0) {
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
            this.f3718B = 1L;
        }
        h0();
    }
}
