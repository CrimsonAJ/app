package J1;

import android.util.SparseIntArray;
import co.notix.R;

/* renamed from: J1.e1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0173e1 extends AbstractC0170d1 {

    /* renamed from: A, reason: collision with root package name */
    public static final SparseIntArray f3915A;

    /* renamed from: z, reason: collision with root package name */
    public long f3916z;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f3915A = sparseIntArray;
        sparseIntArray.put(R.id.imageMovie, 1);
        sparseIntArray.put(R.id.textRating, 2);
        sparseIntArray.put(R.id.textQuality, 3);
    }

    @Override // W.g
    public final void a0() {
        synchronized (this) {
            this.f3916z = 0L;
        }
    }

    @Override // W.g
    public final boolean d0() {
        synchronized (this) {
            try {
                if (this.f3916z != 0) {
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
            this.f3916z = 1L;
        }
        h0();
    }
}
