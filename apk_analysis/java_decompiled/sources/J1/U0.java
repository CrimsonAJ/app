package J1;

import android.util.SparseIntArray;
import co.notix.R;

/* loaded from: classes.dex */
public final class U0 extends T0 {

    /* renamed from: A, reason: collision with root package name */
    public static final SparseIntArray f3787A;

    /* renamed from: z, reason: collision with root package name */
    public long f3788z;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f3787A = sparseIntArray;
        sparseIntArray.put(R.id.imageMovie, 1);
        sparseIntArray.put(R.id.imagePlay, 2);
        sparseIntArray.put(R.id.textEpisode, 3);
        sparseIntArray.put(R.id.textFiller, 4);
    }

    @Override // W.g
    public final void a0() {
        synchronized (this) {
            this.f3788z = 0L;
        }
    }

    @Override // W.g
    public final boolean d0() {
        synchronized (this) {
            try {
                if (this.f3788z != 0) {
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
            this.f3788z = 1L;
        }
        h0();
    }
}
