package J1;

import android.util.SparseIntArray;
import co.notix.R;

/* loaded from: classes.dex */
public final class i1 extends h1 {

    /* renamed from: D, reason: collision with root package name */
    public static final SparseIntArray f3963D;

    /* renamed from: C, reason: collision with root package name */
    public long f3964C;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f3963D = sparseIntArray;
        sparseIntArray.put(R.id.imageMovie, 1);
        sparseIntArray.put(R.id.textRating, 2);
        sparseIntArray.put(R.id.imageOption, 3);
        sparseIntArray.put(R.id.imagePin, 4);
        sparseIntArray.put(R.id.textEpisode, 5);
        sparseIntArray.put(R.id.textTitle, 6);
    }

    @Override // W.g
    public final void a0() {
        synchronized (this) {
            this.f3964C = 0L;
        }
    }

    @Override // W.g
    public final boolean d0() {
        synchronized (this) {
            try {
                if (this.f3964C != 0) {
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
            this.f3964C = 1L;
        }
        h0();
    }
}
