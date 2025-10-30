package J1;

import android.util.SparseIntArray;
import co.notix.R;

/* loaded from: classes.dex */
public final class X0 extends W0 {

    /* renamed from: y, reason: collision with root package name */
    public static final SparseIntArray f3808y;

    /* renamed from: x, reason: collision with root package name */
    public long f3809x;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f3808y = sparseIntArray;
        sparseIntArray.put(R.id.textTitle, 1);
    }

    @Override // W.g
    public final void a0() {
        synchronized (this) {
            this.f3809x = 0L;
        }
    }

    @Override // W.g
    public final boolean d0() {
        synchronized (this) {
            try {
                if (this.f3809x != 0) {
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
            this.f3809x = 1L;
        }
        h0();
    }
}
