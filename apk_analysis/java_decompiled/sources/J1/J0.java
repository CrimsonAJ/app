package J1;

import android.util.SparseIntArray;
import co.notix.R;

/* loaded from: classes.dex */
public final class J0 extends I0 {

    /* renamed from: y, reason: collision with root package name */
    public static final SparseIntArray f3702y;

    /* renamed from: x, reason: collision with root package name */
    public long f3703x;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f3702y = sparseIntArray;
        sparseIntArray.put(R.id.imageAvatar, 1);
    }

    @Override // W.g
    public final void a0() {
        synchronized (this) {
            this.f3703x = 0L;
        }
    }

    @Override // W.g
    public final boolean d0() {
        synchronized (this) {
            try {
                if (this.f3703x != 0) {
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
            this.f3703x = 1L;
        }
        h0();
    }
}
