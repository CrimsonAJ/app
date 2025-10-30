package J1;

import android.util.SparseIntArray;
import co.notix.R;

/* loaded from: classes.dex */
public final class p1 extends o1 {

    /* renamed from: E, reason: collision with root package name */
    public static final SparseIntArray f4042E;

    /* renamed from: D, reason: collision with root package name */
    public long f4043D;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f4042E = sparseIntArray;
        sparseIntArray.put(R.id.view, 1);
        sparseIntArray.put(R.id.textTime, 2);
        sparseIntArray.put(R.id.imageMovie, 3);
        sparseIntArray.put(R.id.viewClickable, 4);
        sparseIntArray.put(R.id.imagePlay, 5);
        sparseIntArray.put(R.id.textMovieName, 6);
        sparseIntArray.put(R.id.textMovieEpisode, 7);
        sparseIntArray.put(R.id.buttonAddMyList, 8);
    }

    @Override // W.g
    public final void a0() {
        synchronized (this) {
            this.f4043D = 0L;
        }
    }

    @Override // W.g
    public final boolean d0() {
        synchronized (this) {
            try {
                if (this.f4043D != 0) {
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
            this.f4043D = 1L;
        }
        h0();
    }
}
