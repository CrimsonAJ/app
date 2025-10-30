package J1;

import android.util.SparseIntArray;
import co.notix.R;

/* loaded from: classes.dex */
public final class S0 extends AbstractC0171e {

    /* renamed from: w, reason: collision with root package name */
    public static final SparseIntArray f3773w;

    /* renamed from: v, reason: collision with root package name */
    public long f3774v;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f3773w = sparseIntArray;
        sparseIntArray.put(R.id.imageMovie, 1);
        sparseIntArray.put(R.id.imagePlay, 2);
        sparseIntArray.put(R.id.textMovieName, 3);
        sparseIntArray.put(R.id.textMovieEpisode, 4);
        sparseIntArray.put(R.id.textMovieSize, 5);
        sparseIntArray.put(R.id.buttonDelete, 6);
    }

    @Override // W.g
    public final void a0() {
        synchronized (this) {
            this.f3774v = 0L;
        }
    }

    @Override // W.g
    public final boolean d0() {
        synchronized (this) {
            try {
                if (this.f3774v != 0) {
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
            this.f3774v = 1L;
        }
        h0();
    }
}
