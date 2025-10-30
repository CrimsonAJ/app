package J1;

import android.util.SparseIntArray;
import co.notix.R;

/* renamed from: J1.j0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0183j0 extends AbstractC0181i0 {

    /* renamed from: x, reason: collision with root package name */
    public static final SparseIntArray f3967x;

    /* renamed from: w, reason: collision with root package name */
    public long f3968w;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f3967x = sparseIntArray;
        sparseIntArray.put(R.id.buttonBack, 1);
        sparseIntArray.put(R.id.textTitleMyList, 2);
        sparseIntArray.put(R.id.imageOption, 3);
        sparseIntArray.put(R.id.layoutEmpty, 4);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C0183j0(android.view.View r6) {
        /*
            r5 = this;
            android.util.SparseIntArray r0 = J1.C0183j0.f3967x
            r1 = 5
            r2 = 0
            java.lang.Object[] r0 = W.g.g0(r6, r1, r2, r0)
            r1 = 1
            r1 = r0[r1]
            androidx.appcompat.widget.AppCompatImageView r1 = (androidx.appcompat.widget.AppCompatImageView) r1
            r3 = 3
            r3 = r0[r3]
            androidx.appcompat.widget.AppCompatImageView r3 = (androidx.appcompat.widget.AppCompatImageView) r3
            r3 = 4
            r3 = r0[r3]
            androidx.appcompat.widget.LinearLayoutCompat r3 = (androidx.appcompat.widget.LinearLayoutCompat) r3
            r3 = 2
            r3 = r0[r3]
            androidx.appcompat.widget.AppCompatTextView r3 = (androidx.appcompat.widget.AppCompatTextView) r3
            r5.<init>(r2, r6, r1)
            r3 = -1
            r5.f3968w = r3
            r1 = 0
            r0 = r0[r1]
            androidx.constraintlayout.widget.ConstraintLayout r0 = (androidx.constraintlayout.widget.ConstraintLayout) r0
            r0.setTag(r2)
            r5.j0(r6)
            r5.e0()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: J1.C0183j0.<init>(android.view.View):void");
    }

    @Override // W.g
    public final void a0() {
        synchronized (this) {
            this.f3968w = 0L;
        }
    }

    @Override // W.g
    public final boolean d0() {
        synchronized (this) {
            try {
                if (this.f3968w != 0) {
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
            this.f3968w = 1L;
        }
        h0();
    }
}
