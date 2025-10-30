package J1;

import android.util.SparseIntArray;
import co.notix.R;

/* loaded from: classes.dex */
public final class D1 extends C1 {

    /* renamed from: z, reason: collision with root package name */
    public static final SparseIntArray f3643z;

    /* renamed from: y, reason: collision with root package name */
    public long f3644y;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f3643z = sparseIntArray;
        sparseIntArray.put(R.id.imageMovie, 1);
        sparseIntArray.put(R.id.imagePlay, 2);
        sparseIntArray.put(R.id.textMovieName, 3);
    }

    @Override // W.g
    public final void a0() {
        synchronized (this) {
            this.f3644y = 0L;
        }
    }

    @Override // W.g
    public final boolean d0() {
        synchronized (this) {
            try {
                if (this.f3644y != 0) {
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
            this.f3644y = 1L;
        }
        h0();
    }
}
