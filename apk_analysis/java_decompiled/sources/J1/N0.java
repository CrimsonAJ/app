package J1;

import android.util.SparseIntArray;
import co.notix.R;

/* loaded from: classes.dex */
public final class N0 extends M0 {

    /* renamed from: E, reason: collision with root package name */
    public static final SparseIntArray f3731E;

    /* renamed from: D, reason: collision with root package name */
    public long f3732D;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f3731E = sparseIntArray;
        sparseIntArray.put(R.id.imageMovie, 1);
        sparseIntArray.put(R.id.textMovieName, 2);
        sparseIntArray.put(R.id.textYearAndCountry, 3);
        sparseIntArray.put(R.id.textGenre, 4);
        sparseIntArray.put(R.id.buttonAddMyList, 5);
        sparseIntArray.put(R.id.textRating, 6);
        sparseIntArray.put(R.id.textQuality, 7);
    }

    @Override // W.g
    public final void a0() {
        synchronized (this) {
            this.f3732D = 0L;
        }
    }

    @Override // W.g
    public final boolean d0() {
        synchronized (this) {
            try {
                if (this.f3732D != 0) {
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
            this.f3732D = 1L;
        }
        h0();
    }
}
