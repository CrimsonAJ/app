package J1;

import android.util.SparseIntArray;
import co.notix.R;

/* loaded from: classes.dex */
public final class r1 extends q1 {

    /* renamed from: z, reason: collision with root package name */
    public static final SparseIntArray f4067z;

    /* renamed from: y, reason: collision with root package name */
    public long f4068y;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f4067z = sparseIntArray;
        sparseIntArray.put(R.id.view, 1);
        sparseIntArray.put(R.id.textTime, 2);
    }

    @Override // W.g
    public final void a0() {
        synchronized (this) {
            this.f4068y = 0L;
        }
    }

    @Override // W.g
    public final boolean d0() {
        synchronized (this) {
            try {
                if (this.f4068y != 0) {
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
            this.f4068y = 1L;
        }
        h0();
    }
}
