package J1;

import android.util.SparseIntArray;
import co.notix.R;

/* renamed from: J1.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0190n extends AbstractC0188m {

    /* renamed from: G, reason: collision with root package name */
    public static final SparseIntArray f4017G;

    /* renamed from: F, reason: collision with root package name */
    public long f4018F;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f4017G = sparseIntArray;
        sparseIntArray.put(R.id.textTitleGiveRate, 1);
        sparseIntArray.put(R.id.view, 2);
        sparseIntArray.put(R.id.view1, 3);
        sparseIntArray.put(R.id.recyclerRating, 4);
        sparseIntArray.put(R.id.textRating, 5);
        sparseIntArray.put(R.id.textTotalRating, 6);
        sparseIntArray.put(R.id.ratingBarTotal, 7);
        sparseIntArray.put(R.id.textTotalVote, 8);
        sparseIntArray.put(R.id.view2, 9);
        sparseIntArray.put(R.id.ratingBar, 10);
        sparseIntArray.put(R.id.buttonCancel, 11);
        sparseIntArray.put(R.id.buttonSubmit, 12);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C0190n(android.view.View r17) {
        /*
            r16 = this;
            android.util.SparseIntArray r0 = J1.C0190n.f4017G
            r1 = 13
            r2 = 0
            r5 = r17
            java.lang.Object[] r0 = W.g.g0(r5, r1, r2, r0)
            r1 = 11
            r1 = r0[r1]
            r6 = r1
            com.google.android.material.button.MaterialButton r6 = (com.google.android.material.button.MaterialButton) r6
            r1 = 12
            r1 = r0[r1]
            r7 = r1
            com.google.android.material.button.MaterialButton r7 = (com.google.android.material.button.MaterialButton) r7
            r1 = 10
            r1 = r0[r1]
            r8 = r1
            androidx.appcompat.widget.AppCompatRatingBar r8 = (androidx.appcompat.widget.AppCompatRatingBar) r8
            r1 = 7
            r1 = r0[r1]
            r9 = r1
            androidx.appcompat.widget.AppCompatRatingBar r9 = (androidx.appcompat.widget.AppCompatRatingBar) r9
            r1 = 4
            r1 = r0[r1]
            r10 = r1
            androidx.recyclerview.widget.RecyclerView r10 = (androidx.recyclerview.widget.RecyclerView) r10
            r1 = 5
            r1 = r0[r1]
            r11 = r1
            androidx.appcompat.widget.AppCompatTextView r11 = (androidx.appcompat.widget.AppCompatTextView) r11
            r1 = 1
            r1 = r0[r1]
            androidx.appcompat.widget.AppCompatTextView r1 = (androidx.appcompat.widget.AppCompatTextView) r1
            r1 = 6
            r1 = r0[r1]
            androidx.appcompat.widget.AppCompatTextView r1 = (androidx.appcompat.widget.AppCompatTextView) r1
            r1 = 8
            r1 = r0[r1]
            r12 = r1
            androidx.appcompat.widget.AppCompatTextView r12 = (androidx.appcompat.widget.AppCompatTextView) r12
            r1 = 2
            r1 = r0[r1]
            r13 = r1
            android.view.View r13 = (android.view.View) r13
            r1 = 3
            r1 = r0[r1]
            r14 = r1
            android.view.View r14 = (android.view.View) r14
            r1 = 9
            r1 = r0[r1]
            r15 = r1
            android.view.View r15 = (android.view.View) r15
            r4 = 0
            r3 = r16
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            r3 = -1
            r1 = r16
            r1.f4018F = r3
            r3 = 0
            r0 = r0[r3]
            androidx.constraintlayout.widget.ConstraintLayout r0 = (androidx.constraintlayout.widget.ConstraintLayout) r0
            r0.setTag(r2)
            r16.j0(r17)
            r1.e0()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: J1.C0190n.<init>(android.view.View):void");
    }

    @Override // W.g
    public final void a0() {
        synchronized (this) {
            this.f4018F = 0L;
        }
    }

    @Override // W.g
    public final boolean d0() {
        synchronized (this) {
            try {
                if (this.f4018F != 0) {
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
            this.f4018F = 1L;
        }
        h0();
    }
}
