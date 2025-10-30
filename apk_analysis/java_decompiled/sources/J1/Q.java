package J1;

import android.util.SparseIntArray;
import co.notix.R;

/* loaded from: classes.dex */
public final class Q extends P {

    /* renamed from: F, reason: collision with root package name */
    public static final SparseIntArray f3757F;

    /* renamed from: E, reason: collision with root package name */
    public long f3758E;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f3757F = sparseIntArray;
        sparseIntArray.put(R.id.appBar, 1);
        sparseIntArray.put(R.id.slider, 2);
        sparseIntArray.put(R.id.imageLogo, 3);
        sparseIntArray.put(R.id.imageSearch, 4);
        sparseIntArray.put(R.id.imageNotification, 5);
        sparseIntArray.put(R.id.buttonPlay, 6);
        sparseIntArray.put(R.id.buttonAddMyList, 7);
        sparseIntArray.put(R.id.textGenre, 8);
        sparseIntArray.put(R.id.textMovieName, 9);
        sparseIntArray.put(R.id.refreshLayout, 10);
        sparseIntArray.put(R.id.recyclerMovies, 11);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public Q(android.view.View r16) {
        /*
            r15 = this;
            android.util.SparseIntArray r0 = J1.Q.f3757F
            r1 = 12
            r2 = 0
            r5 = r16
            java.lang.Object[] r0 = W.g.g0(r5, r1, r2, r0)
            r1 = 1
            r1 = r0[r1]
            com.google.android.material.appbar.AppBarLayout r1 = (com.google.android.material.appbar.AppBarLayout) r1
            r1 = 7
            r1 = r0[r1]
            r6 = r1
            com.google.android.material.button.MaterialButton r6 = (com.google.android.material.button.MaterialButton) r6
            r1 = 6
            r1 = r0[r1]
            r7 = r1
            com.google.android.material.button.MaterialButton r7 = (com.google.android.material.button.MaterialButton) r7
            r1 = 3
            r1 = r0[r1]
            androidx.appcompat.widget.AppCompatImageView r1 = (androidx.appcompat.widget.AppCompatImageView) r1
            r1 = 5
            r1 = r0[r1]
            r8 = r1
            androidx.appcompat.widget.AppCompatImageView r8 = (androidx.appcompat.widget.AppCompatImageView) r8
            r1 = 4
            r1 = r0[r1]
            r9 = r1
            androidx.appcompat.widget.AppCompatImageView r9 = (androidx.appcompat.widget.AppCompatImageView) r9
            r1 = 11
            r1 = r0[r1]
            r10 = r1
            androidx.recyclerview.widget.RecyclerView r10 = (androidx.recyclerview.widget.RecyclerView) r10
            r1 = 10
            r1 = r0[r1]
            r11 = r1
            androidx.swiperefreshlayout.widget.SwipeRefreshLayout r11 = (androidx.swiperefreshlayout.widget.SwipeRefreshLayout) r11
            r1 = 2
            r1 = r0[r1]
            r12 = r1
            androidx.viewpager2.widget.ViewPager2 r12 = (androidx.viewpager2.widget.ViewPager2) r12
            r1 = 8
            r1 = r0[r1]
            r13 = r1
            androidx.appcompat.widget.AppCompatTextView r13 = (androidx.appcompat.widget.AppCompatTextView) r13
            r1 = 9
            r1 = r0[r1]
            r14 = r1
            androidx.appcompat.widget.AppCompatTextView r14 = (androidx.appcompat.widget.AppCompatTextView) r14
            r4 = 0
            r3 = r15
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            r4 = -1
            r15.f3758E = r4
            r1 = 0
            r0 = r0[r1]
            androidx.coordinatorlayout.widget.CoordinatorLayout r0 = (androidx.coordinatorlayout.widget.CoordinatorLayout) r0
            r0.setTag(r2)
            r15.j0(r16)
            r15.e0()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: J1.Q.<init>(android.view.View):void");
    }

    @Override // W.g
    public final void a0() {
        synchronized (this) {
            this.f3758E = 0L;
        }
    }

    @Override // W.g
    public final boolean d0() {
        synchronized (this) {
            try {
                if (this.f3758E != 0) {
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
            this.f3758E = 1L;
        }
        h0();
    }
}
