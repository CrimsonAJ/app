package J1;

import android.util.SparseIntArray;
import co.notix.R;

/* loaded from: classes.dex */
public final class R0 extends Q0 {

    /* renamed from: C, reason: collision with root package name */
    public static final SparseIntArray f3765C;

    /* renamed from: B, reason: collision with root package name */
    public long f3766B;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f3765C = sparseIntArray;
        sparseIntArray.put(R.id.imageOption, 1);
        sparseIntArray.put(R.id.imageMovie, 2);
        sparseIntArray.put(R.id.textEpisode, 3);
        sparseIntArray.put(R.id.imageDetail, 4);
        sparseIntArray.put(R.id.progressPercent, 5);
    }

    @Override // W.g
    public final void a0() {
        synchronized (this) {
            this.f3766B = 0L;
        }
    }

    @Override // W.g
    public final boolean d0() {
        synchronized (this) {
            try {
                if (this.f3766B != 0) {
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
            this.f3766B = 1L;
        }
        h0();
    }
}
