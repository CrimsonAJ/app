package J1;

import android.util.SparseIntArray;
import co.notix.R;

/* loaded from: classes.dex */
public final class n1 extends m1 {

    /* renamed from: z, reason: collision with root package name */
    public static final SparseIntArray f4020z;

    /* renamed from: y, reason: collision with root package name */
    public long f4021y;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f4020z = sparseIntArray;
        sparseIntArray.put(R.id.textRate, 1);
        sparseIntArray.put(R.id.rate, 2);
    }

    @Override // W.g
    public final void a0() {
        synchronized (this) {
            this.f4021y = 0L;
        }
    }

    @Override // W.g
    public final boolean d0() {
        synchronized (this) {
            try {
                if (this.f4021y != 0) {
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
            this.f4021y = 1L;
        }
        h0();
    }
}
