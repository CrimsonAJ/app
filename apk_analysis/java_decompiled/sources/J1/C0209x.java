package J1;

import android.util.SparseIntArray;
import co.notix.R;

/* renamed from: J1.x, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0209x extends AbstractC0207w {

    /* renamed from: y, reason: collision with root package name */
    public static final SparseIntArray f4127y;

    /* renamed from: x, reason: collision with root package name */
    public long f4128x;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f4127y = sparseIntArray;
        sparseIntArray.put(R.id.textDetail, 1);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C0209x(android.view.View r6) {
        /*
            r5 = this;
            android.util.SparseIntArray r0 = J1.C0209x.f4127y
            r1 = 2
            r2 = 0
            java.lang.Object[] r0 = W.g.g0(r6, r1, r2, r0)
            r1 = 1
            r1 = r0[r1]
            androidx.appcompat.widget.AppCompatTextView r1 = (androidx.appcompat.widget.AppCompatTextView) r1
            r5.<init>(r2, r6, r1)
            r3 = -1
            r5.f4128x = r3
            r1 = 0
            r0 = r0[r1]
            android.widget.FrameLayout r0 = (android.widget.FrameLayout) r0
            r0.setTag(r2)
            r5.j0(r6)
            r5.e0()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: J1.C0209x.<init>(android.view.View):void");
    }

    @Override // W.g
    public final void a0() {
        synchronized (this) {
            this.f4128x = 0L;
        }
    }

    @Override // W.g
    public final boolean d0() {
        synchronized (this) {
            try {
                if (this.f4128x != 0) {
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
            this.f4128x = 1L;
        }
        h0();
    }
}
