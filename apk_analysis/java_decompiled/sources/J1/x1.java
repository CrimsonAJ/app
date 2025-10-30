package J1;

import android.util.SparseIntArray;
import co.notix.R;

/* loaded from: classes.dex */
public final class x1 extends w1 {

    /* renamed from: A, reason: collision with root package name */
    public static final SparseIntArray f4131A;

    /* renamed from: z, reason: collision with root package name */
    public long f4132z;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f4131A = sparseIntArray;
        sparseIntArray.put(R.id.imageMovie, 1);
        sparseIntArray.put(R.id.textEpisode, 2);
        sparseIntArray.put(R.id.viewSelectEpisode, 3);
    }

    @Override // W.g
    public final void a0() {
        synchronized (this) {
            this.f4132z = 0L;
        }
    }

    @Override // W.g
    public final boolean d0() {
        synchronized (this) {
            try {
                if (this.f4132z != 0) {
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
            this.f4132z = 1L;
        }
        h0();
    }
}
