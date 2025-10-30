package J1;

import android.util.SparseIntArray;
import co.notix.R;

/* renamed from: J1.a1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0161a1 extends Z0 {

    /* renamed from: A, reason: collision with root package name */
    public static final SparseIntArray f3831A;

    /* renamed from: z, reason: collision with root package name */
    public long f3832z;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f3831A = sparseIntArray;
        sparseIntArray.put(R.id.categoryTitle, 1);
        sparseIntArray.put(R.id.buttonSeeAll, 2);
        sparseIntArray.put(R.id.recyclerHozMovies, 3);
    }

    @Override // W.g
    public final void a0() {
        synchronized (this) {
            this.f3832z = 0L;
        }
    }

    @Override // W.g
    public final boolean d0() {
        synchronized (this) {
            try {
                if (this.f3832z != 0) {
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
            this.f3832z = 1L;
        }
        h0();
    }
}
