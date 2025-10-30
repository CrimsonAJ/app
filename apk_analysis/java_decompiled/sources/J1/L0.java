package J1;

import android.util.SparseIntArray;
import co.notix.R;

/* loaded from: classes.dex */
public final class L0 extends K0 {

    /* renamed from: z, reason: collision with root package name */
    public static final SparseIntArray f3715z;

    /* renamed from: y, reason: collision with root package name */
    public long f3716y;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f3715z = sparseIntArray;
        sparseIntArray.put(R.id.textDayOfWeek, 1);
        sparseIntArray.put(R.id.textDate, 2);
    }

    @Override // W.g
    public final void a0() {
        synchronized (this) {
            this.f3716y = 0L;
        }
    }

    @Override // W.g
    public final boolean d0() {
        synchronized (this) {
            try {
                if (this.f3716y != 0) {
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
            this.f3716y = 1L;
        }
        h0();
    }
}
