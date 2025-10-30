package J1;

import android.util.SparseIntArray;
import co.notix.R;

/* loaded from: classes.dex */
public final class K extends J {

    /* renamed from: D, reason: collision with root package name */
    public static final SparseIntArray f3704D;

    /* renamed from: C, reason: collision with root package name */
    public long f3705C;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f3704D = sparseIntArray;
        sparseIntArray.put(R.id.buttonBack, 1);
        sparseIntArray.put(R.id.textTitleSortAndFilter, 2);
        sparseIntArray.put(R.id.textTitleSort, 3);
        sparseIntArray.put(R.id.recyclerSort, 4);
        sparseIntArray.put(R.id.textType, 5);
        sparseIntArray.put(R.id.recyclerType, 6);
        sparseIntArray.put(R.id.textStatus, 7);
        sparseIntArray.put(R.id.recyclerStatus, 8);
        sparseIntArray.put(R.id.textGenre, 9);
        sparseIntArray.put(R.id.recyclerGenre, 10);
        sparseIntArray.put(R.id.layoutAction, 11);
        sparseIntArray.put(R.id.buttonReset, 12);
        sparseIntArray.put(R.id.buttonApply, 13);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public K(android.view.View r14) {
        /*
            r13 = this;
            android.util.SparseIntArray r0 = J1.K.f3704D
            r1 = 14
            r2 = 0
            java.lang.Object[] r0 = W.g.g0(r14, r1, r2, r0)
            r1 = 13
            r1 = r0[r1]
            r6 = r1
            com.google.android.material.button.MaterialButton r6 = (com.google.android.material.button.MaterialButton) r6
            r1 = 1
            r1 = r0[r1]
            r7 = r1
            androidx.appcompat.widget.AppCompatImageView r7 = (androidx.appcompat.widget.AppCompatImageView) r7
            r1 = 12
            r1 = r0[r1]
            r8 = r1
            com.google.android.material.button.MaterialButton r8 = (com.google.android.material.button.MaterialButton) r8
            r1 = 11
            r1 = r0[r1]
            android.widget.LinearLayout r1 = (android.widget.LinearLayout) r1
            r1 = 10
            r1 = r0[r1]
            r9 = r1
            androidx.recyclerview.widget.RecyclerView r9 = (androidx.recyclerview.widget.RecyclerView) r9
            r1 = 4
            r1 = r0[r1]
            r10 = r1
            androidx.recyclerview.widget.RecyclerView r10 = (androidx.recyclerview.widget.RecyclerView) r10
            r1 = 8
            r1 = r0[r1]
            r11 = r1
            androidx.recyclerview.widget.RecyclerView r11 = (androidx.recyclerview.widget.RecyclerView) r11
            r1 = 6
            r1 = r0[r1]
            r12 = r1
            androidx.recyclerview.widget.RecyclerView r12 = (androidx.recyclerview.widget.RecyclerView) r12
            r1 = 9
            r1 = r0[r1]
            androidx.appcompat.widget.AppCompatTextView r1 = (androidx.appcompat.widget.AppCompatTextView) r1
            r1 = 7
            r1 = r0[r1]
            androidx.appcompat.widget.AppCompatTextView r1 = (androidx.appcompat.widget.AppCompatTextView) r1
            r1 = 3
            r1 = r0[r1]
            androidx.appcompat.widget.AppCompatTextView r1 = (androidx.appcompat.widget.AppCompatTextView) r1
            r1 = 2
            r1 = r0[r1]
            androidx.appcompat.widget.AppCompatTextView r1 = (androidx.appcompat.widget.AppCompatTextView) r1
            r1 = 5
            r1 = r0[r1]
            androidx.appcompat.widget.AppCompatTextView r1 = (androidx.appcompat.widget.AppCompatTextView) r1
            r4 = 0
            r3 = r13
            r5 = r14
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12)
            r6 = -1
            r3.f3705C = r6
            r14 = 0
            r14 = r0[r14]
            androidx.constraintlayout.widget.ConstraintLayout r14 = (androidx.constraintlayout.widget.ConstraintLayout) r14
            r14.setTag(r2)
            r13.j0(r5)
            r13.e0()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: J1.K.<init>(android.view.View):void");
    }

    @Override // W.g
    public final void a0() {
        synchronized (this) {
            this.f3705C = 0L;
        }
    }

    @Override // W.g
    public final boolean d0() {
        synchronized (this) {
            try {
                if (this.f3705C != 0) {
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
            this.f3705C = 1L;
        }
        h0();
    }
}
