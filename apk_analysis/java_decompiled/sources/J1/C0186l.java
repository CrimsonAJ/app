package J1;

import android.util.SparseIntArray;
import co.notix.R;

/* renamed from: J1.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0186l extends AbstractC0184k {

    /* renamed from: A, reason: collision with root package name */
    public static final SparseIntArray f3984A;

    /* renamed from: z, reason: collision with root package name */
    public long f3985z;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f3984A = sparseIntArray;
        sparseIntArray.put(R.id.viewTop, 1);
        sparseIntArray.put(R.id.buttonPinTop, 2);
        sparseIntArray.put(R.id.imagePin, 3);
        sparseIntArray.put(R.id.buttonRemove, 4);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C0186l(android.view.View r11) {
        /*
            r10 = this;
            android.util.SparseIntArray r0 = J1.C0186l.f3984A
            r1 = 5
            r2 = 0
            java.lang.Object[] r0 = W.g.g0(r11, r1, r2, r0)
            r1 = 2
            r1 = r0[r1]
            r6 = r1
            androidx.appcompat.widget.AppCompatTextView r6 = (androidx.appcompat.widget.AppCompatTextView) r6
            r1 = 4
            r1 = r0[r1]
            r7 = r1
            androidx.appcompat.widget.AppCompatTextView r7 = (androidx.appcompat.widget.AppCompatTextView) r7
            r1 = 3
            r1 = r0[r1]
            r8 = r1
            androidx.appcompat.widget.AppCompatImageView r8 = (androidx.appcompat.widget.AppCompatImageView) r8
            r1 = 1
            r1 = r0[r1]
            r9 = r1
            android.view.View r9 = (android.view.View) r9
            r4 = 0
            r3 = r10
            r5 = r11
            r3.<init>(r4, r5, r6, r7, r8, r9)
            r6 = -1
            r3.f3985z = r6
            r11 = 0
            r11 = r0[r11]
            androidx.constraintlayout.widget.ConstraintLayout r11 = (androidx.constraintlayout.widget.ConstraintLayout) r11
            r11.setTag(r2)
            r10.j0(r5)
            r10.e0()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: J1.C0186l.<init>(android.view.View):void");
    }

    @Override // W.g
    public final void a0() {
        synchronized (this) {
            this.f3985z = 0L;
        }
    }

    @Override // W.g
    public final boolean d0() {
        synchronized (this) {
            try {
                if (this.f3985z != 0) {
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
            this.f3985z = 1L;
        }
        h0();
    }
}
