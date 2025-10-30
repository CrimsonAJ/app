package J1;

import android.util.SparseIntArray;
import co.notix.R;

/* loaded from: classes.dex */
public final class A1 extends z1 {

    /* renamed from: A, reason: collision with root package name */
    public static final SparseIntArray f3610A;

    /* renamed from: z, reason: collision with root package name */
    public long f3611z;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f3610A = sparseIntArray;
        sparseIntArray.put(R.id.viewBackgroundSelected, 1);
        sparseIntArray.put(R.id.textName, 2);
        sparseIntArray.put(R.id.viewDotSelected, 3);
    }

    @Override // W.g
    public final void a0() {
        synchronized (this) {
            this.f3611z = 0L;
        }
    }

    @Override // W.g
    public final boolean d0() {
        synchronized (this) {
            try {
                if (this.f3611z != 0) {
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
            this.f3611z = 1L;
        }
        h0();
    }
}
