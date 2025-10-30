package J1;

import android.util.SparseIntArray;
import co.notix.R;

/* loaded from: classes.dex */
public final class T extends S {

    /* renamed from: C, reason: collision with root package name */
    public static final SparseIntArray f3775C;

    /* renamed from: B, reason: collision with root package name */
    public long f3776B;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f3775C = sparseIntArray;
        sparseIntArray.put(R.id.bottomNavView, 1);
        sparseIntArray.put(R.id.nestedNavHostFragment, 2);
        sparseIntArray.put(R.id.layoutContinue, 3);
        sparseIntArray.put(R.id.imagePoster, 4);
        sparseIntArray.put(R.id.textTitleContinue, 5);
        sparseIntArray.put(R.id.imagePlay, 6);
        sparseIntArray.put(R.id.textContinue, 7);
        sparseIntArray.put(R.id.imageClearContinue, 8);
        sparseIntArray.put(R.id.loading, 9);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public T(android.view.View r13) {
        /*
            r12 = this;
            android.util.SparseIntArray r0 = J1.T.f3775C
            r1 = 10
            r2 = 0
            java.lang.Object[] r0 = W.g.g0(r13, r1, r2, r0)
            r1 = 1
            r1 = r0[r1]
            r6 = r1
            com.google.android.material.bottomnavigation.BottomNavigationView r6 = (com.google.android.material.bottomnavigation.BottomNavigationView) r6
            r1 = 8
            r1 = r0[r1]
            r7 = r1
            android.widget.FrameLayout r7 = (android.widget.FrameLayout) r7
            r1 = 6
            r1 = r0[r1]
            androidx.appcompat.widget.AppCompatImageView r1 = (androidx.appcompat.widget.AppCompatImageView) r1
            r1 = 4
            r1 = r0[r1]
            r8 = r1
            com.google.android.material.imageview.ShapeableImageView r8 = (com.google.android.material.imageview.ShapeableImageView) r8
            r1 = 3
            r1 = r0[r1]
            r9 = r1
            androidx.constraintlayout.widget.ConstraintLayout r9 = (androidx.constraintlayout.widget.ConstraintLayout) r9
            r1 = 9
            r1 = r0[r1]
            r10 = r1
            com.google.android.material.progressindicator.LinearProgressIndicator r10 = (com.google.android.material.progressindicator.LinearProgressIndicator) r10
            r1 = 2
            r1 = r0[r1]
            androidx.fragment.app.FragmentContainerView r1 = (androidx.fragment.app.FragmentContainerView) r1
            r1 = 7
            r1 = r0[r1]
            androidx.appcompat.widget.AppCompatTextView r1 = (androidx.appcompat.widget.AppCompatTextView) r1
            r1 = 5
            r1 = r0[r1]
            r11 = r1
            androidx.appcompat.widget.AppCompatTextView r11 = (androidx.appcompat.widget.AppCompatTextView) r11
            r4 = 0
            r3 = r12
            r5 = r13
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11)
            r6 = -1
            r3.f3776B = r6
            r13 = 0
            r13 = r0[r13]
            androidx.constraintlayout.widget.ConstraintLayout r13 = (androidx.constraintlayout.widget.ConstraintLayout) r13
            r13.setTag(r2)
            r12.j0(r5)
            r12.e0()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: J1.T.<init>(android.view.View):void");
    }

    @Override // W.g
    public final void a0() {
        synchronized (this) {
            this.f3776B = 0L;
        }
    }

    @Override // W.g
    public final boolean d0() {
        synchronized (this) {
            try {
                if (this.f3776B != 0) {
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
            this.f3776B = 1L;
        }
        h0();
    }
}
