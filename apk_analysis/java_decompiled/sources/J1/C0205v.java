package J1;

import android.util.SparseIntArray;
import co.notix.R;

/* renamed from: J1.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0205v extends AbstractC0203u {

    /* renamed from: A, reason: collision with root package name */
    public static final SparseIntArray f4112A;

    /* renamed from: z, reason: collision with root package name */
    public long f4113z;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f4112A = sparseIntArray;
        sparseIntArray.put(R.id.textCommonError, 1);
        sparseIntArray.put(R.id.buttonRetry, 2);
        sparseIntArray.put(R.id.buttonNeedHelp, 3);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C0205v(android.view.View r10) {
        /*
            r9 = this;
            android.util.SparseIntArray r0 = J1.C0205v.f4112A
            r1 = 4
            r2 = 0
            java.lang.Object[] r0 = W.g.g0(r10, r1, r2, r0)
            r1 = 3
            r1 = r0[r1]
            r6 = r1
            com.google.android.material.button.MaterialButton r6 = (com.google.android.material.button.MaterialButton) r6
            r1 = 2
            r1 = r0[r1]
            r7 = r1
            com.google.android.material.button.MaterialButton r7 = (com.google.android.material.button.MaterialButton) r7
            r1 = 1
            r1 = r0[r1]
            r8 = r1
            android.widget.TextView r8 = (android.widget.TextView) r8
            r4 = 0
            r3 = r9
            r5 = r10
            r3.<init>(r4, r5, r6, r7, r8)
            r6 = -1
            r3.f4113z = r6
            r10 = 0
            r10 = r0[r10]
            android.widget.FrameLayout r10 = (android.widget.FrameLayout) r10
            r10.setTag(r2)
            r9.j0(r5)
            r9.e0()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: J1.C0205v.<init>(android.view.View):void");
    }

    @Override // W.g
    public final void a0() {
        synchronized (this) {
            this.f4113z = 0L;
        }
    }

    @Override // W.g
    public final boolean d0() {
        synchronized (this) {
            try {
                if (this.f4113z != 0) {
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
            this.f4113z = 1L;
        }
        h0();
    }
}
