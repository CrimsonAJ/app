package J1;

import android.util.SparseIntArray;
import co.notix.R;

/* loaded from: classes.dex */
public final class B0 extends A0 {

    /* renamed from: y, reason: collision with root package name */
    public static final SparseIntArray f3615y;

    /* renamed from: x, reason: collision with root package name */
    public long f3616x;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f3615y = sparseIntArray;
        sparseIntArray.put(R.id.appCompatImageView, 1);
        sparseIntArray.put(R.id.imageLoading, 2);
        sparseIntArray.put(R.id.buttonRetry, 3);
    }

    @Override // W.g
    public final void a0() {
        synchronized (this) {
            this.f3616x = 0L;
        }
    }

    @Override // W.g
    public final boolean d0() {
        synchronized (this) {
            try {
                if (this.f3616x != 0) {
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
            this.f3616x = 1L;
        }
        h0();
    }
}
