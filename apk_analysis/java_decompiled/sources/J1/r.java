package J1;

import android.util.SparseIntArray;
import co.notix.R;

/* loaded from: classes.dex */
public final class r extends AbstractC0196q {

    /* renamed from: B, reason: collision with root package name */
    public static final SparseIntArray f4062B;

    /* renamed from: A, reason: collision with root package name */
    public long f4063A;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f4062B = sparseIntArray;
        sparseIntArray.put(R.id.layoutHeader, 1);
        sparseIntArray.put(R.id.textMovieName, 2);
        sparseIntArray.put(R.id.textQuality, 3);
        sparseIntArray.put(R.id.progressBar, 4);
        sparseIntArray.put(R.id.recyclerSubtitle, 5);
        sparseIntArray.put(R.id.buttonBack, 6);
        sparseIntArray.put(R.id.buttonDownload, 7);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public r(android.view.View r12) {
        /*
            r11 = this;
            android.util.SparseIntArray r0 = J1.r.f4062B
            r1 = 8
            r2 = 0
            java.lang.Object[] r0 = W.g.g0(r12, r1, r2, r0)
            r1 = 6
            r1 = r0[r1]
            r6 = r1
            com.google.android.material.button.MaterialButton r6 = (com.google.android.material.button.MaterialButton) r6
            r1 = 7
            r1 = r0[r1]
            r7 = r1
            com.google.android.material.button.MaterialButton r7 = (com.google.android.material.button.MaterialButton) r7
            r1 = 1
            r1 = r0[r1]
            androidx.appcompat.widget.LinearLayoutCompat r1 = (androidx.appcompat.widget.LinearLayoutCompat) r1
            r1 = 4
            r1 = r0[r1]
            android.widget.ProgressBar r1 = (android.widget.ProgressBar) r1
            r1 = 5
            r1 = r0[r1]
            r8 = r1
            androidx.recyclerview.widget.RecyclerView r8 = (androidx.recyclerview.widget.RecyclerView) r8
            r1 = 2
            r1 = r0[r1]
            r9 = r1
            androidx.appcompat.widget.AppCompatTextView r9 = (androidx.appcompat.widget.AppCompatTextView) r9
            r1 = 3
            r1 = r0[r1]
            r10 = r1
            androidx.appcompat.widget.AppCompatTextView r10 = (androidx.appcompat.widget.AppCompatTextView) r10
            r4 = 0
            r3 = r11
            r5 = r12
            r3.<init>(r4, r5, r6, r7, r8, r9, r10)
            r6 = -1
            r3.f4063A = r6
            r12 = 0
            r12 = r0[r12]
            androidx.constraintlayout.widget.ConstraintLayout r12 = (androidx.constraintlayout.widget.ConstraintLayout) r12
            r12.setTag(r2)
            r11.j0(r5)
            r11.e0()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: J1.r.<init>(android.view.View):void");
    }

    @Override // W.g
    public final void a0() {
        synchronized (this) {
            this.f4063A = 0L;
        }
    }

    @Override // W.g
    public final boolean d0() {
        synchronized (this) {
            try {
                if (this.f4063A != 0) {
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
            this.f4063A = 1L;
        }
        h0();
    }
}
