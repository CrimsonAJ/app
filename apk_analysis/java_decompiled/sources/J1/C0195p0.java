package J1;

import android.util.SparseIntArray;
import co.notix.R;

/* renamed from: J1.p0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0195p0 extends AbstractC0193o0 {

    /* renamed from: A, reason: collision with root package name */
    public static final SparseIntArray f4040A;

    /* renamed from: z, reason: collision with root package name */
    public long f4041z;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f4040A = sparseIntArray;
        sparseIntArray.put(R.id.imageView, 1);
        sparseIntArray.put(R.id.textCongratulationOA, 2);
        sparseIntArray.put(R.id.textMessage, 3);
        sparseIntArray.put(R.id.buttonClose, 4);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C0195p0(android.view.View r10) {
        /*
            r9 = this;
            android.util.SparseIntArray r0 = J1.C0195p0.f4040A
            r1 = 5
            r2 = 0
            java.lang.Object[] r0 = W.g.g0(r10, r1, r2, r0)
            r1 = 4
            r1 = r0[r1]
            r6 = r1
            com.google.android.material.button.MaterialButton r6 = (com.google.android.material.button.MaterialButton) r6
            r1 = 1
            r1 = r0[r1]
            androidx.appcompat.widget.AppCompatImageView r1 = (androidx.appcompat.widget.AppCompatImageView) r1
            r1 = 2
            r1 = r0[r1]
            r7 = r1
            androidx.appcompat.widget.AppCompatTextView r7 = (androidx.appcompat.widget.AppCompatTextView) r7
            r1 = 3
            r1 = r0[r1]
            r8 = r1
            androidx.appcompat.widget.AppCompatTextView r8 = (androidx.appcompat.widget.AppCompatTextView) r8
            r4 = 0
            r3 = r9
            r5 = r10
            r3.<init>(r4, r5, r6, r7, r8)
            r6 = -1
            r3.f4041z = r6
            r10 = 0
            r10 = r0[r10]
            androidx.constraintlayout.widget.ConstraintLayout r10 = (androidx.constraintlayout.widget.ConstraintLayout) r10
            r10.setTag(r2)
            r9.j0(r5)
            r9.e0()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: J1.C0195p0.<init>(android.view.View):void");
    }

    @Override // W.g
    public final void a0() {
        synchronized (this) {
            this.f4041z = 0L;
        }
    }

    @Override // W.g
    public final boolean d0() {
        synchronized (this) {
            try {
                if (this.f4041z != 0) {
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
            this.f4041z = 1L;
        }
        h0();
    }
}
