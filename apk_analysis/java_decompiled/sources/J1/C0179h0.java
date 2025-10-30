package J1;

import android.util.SparseIntArray;
import co.notix.R;

/* renamed from: J1.h0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0179h0 extends AbstractC0177g0 {

    /* renamed from: D, reason: collision with root package name */
    public static final SparseIntArray f3949D;

    /* renamed from: C, reason: collision with root package name */
    public long f3950C;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f3949D = sparseIntArray;
        sparseIntArray.put(R.id.imageLogo, 1);
        sparseIntArray.put(R.id.textTitleMyList, 2);
        sparseIntArray.put(R.id.buttonSearch, 3);
        sparseIntArray.put(R.id.layoutEmpty, 4);
        sparseIntArray.put(R.id.refreshLayout, 5);
        sparseIntArray.put(R.id.recyclerMovies, 6);
        sparseIntArray.put(R.id.view, 7);
        sparseIntArray.put(R.id.textMyProfile, 8);
        sparseIntArray.put(R.id.textMessageSignIn, 9);
        sparseIntArray.put(R.id.buttonContinue, 10);
        sparseIntArray.put(R.id.groupSignInRequire, 11);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C0179h0(android.view.View r14) {
        /*
            r13 = this;
            android.util.SparseIntArray r0 = J1.C0179h0.f3949D
            r1 = 12
            r2 = 0
            java.lang.Object[] r0 = W.g.g0(r14, r1, r2, r0)
            r1 = 10
            r1 = r0[r1]
            r6 = r1
            com.google.android.material.button.MaterialButton r6 = (com.google.android.material.button.MaterialButton) r6
            r1 = 3
            r1 = r0[r1]
            r7 = r1
            androidx.appcompat.widget.AppCompatImageView r7 = (androidx.appcompat.widget.AppCompatImageView) r7
            r1 = 11
            r1 = r0[r1]
            r8 = r1
            androidx.constraintlayout.widget.Group r8 = (androidx.constraintlayout.widget.Group) r8
            r1 = 1
            r1 = r0[r1]
            androidx.appcompat.widget.AppCompatImageView r1 = (androidx.appcompat.widget.AppCompatImageView) r1
            r1 = 4
            r1 = r0[r1]
            r9 = r1
            androidx.appcompat.widget.LinearLayoutCompat r9 = (androidx.appcompat.widget.LinearLayoutCompat) r9
            r1 = 6
            r1 = r0[r1]
            r10 = r1
            androidx.recyclerview.widget.RecyclerView r10 = (androidx.recyclerview.widget.RecyclerView) r10
            r1 = 5
            r1 = r0[r1]
            r11 = r1
            androidx.swiperefreshlayout.widget.SwipeRefreshLayout r11 = (androidx.swiperefreshlayout.widget.SwipeRefreshLayout) r11
            r1 = 9
            r1 = r0[r1]
            androidx.appcompat.widget.AppCompatTextView r1 = (androidx.appcompat.widget.AppCompatTextView) r1
            r1 = 8
            r1 = r0[r1]
            androidx.appcompat.widget.AppCompatTextView r1 = (androidx.appcompat.widget.AppCompatTextView) r1
            r1 = 2
            r1 = r0[r1]
            androidx.appcompat.widget.AppCompatTextView r1 = (androidx.appcompat.widget.AppCompatTextView) r1
            r1 = 7
            r1 = r0[r1]
            r12 = r1
            android.view.View r12 = (android.view.View) r12
            r4 = 0
            r3 = r13
            r5 = r14
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12)
            r6 = -1
            r3.f3950C = r6
            r14 = 0
            r14 = r0[r14]
            androidx.constraintlayout.widget.ConstraintLayout r14 = (androidx.constraintlayout.widget.ConstraintLayout) r14
            r14.setTag(r2)
            r13.j0(r5)
            r13.e0()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: J1.C0179h0.<init>(android.view.View):void");
    }

    @Override // W.g
    public final void a0() {
        synchronized (this) {
            this.f3950C = 0L;
        }
    }

    @Override // W.g
    public final boolean d0() {
        synchronized (this) {
            try {
                if (this.f3950C != 0) {
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
            this.f3950C = 1L;
        }
        h0();
    }
}
