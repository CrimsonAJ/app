package J1;

import android.util.SparseIntArray;
import co.notix.R;

/* loaded from: classes.dex */
public final class v1 extends u1 {

    /* renamed from: C, reason: collision with root package name */
    public static final SparseIntArray f4117C;

    /* renamed from: B, reason: collision with root package name */
    public long f4118B;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f4117C = sparseIntArray;
        sparseIntArray.put(R.id.imageMovie, 1);
        sparseIntArray.put(R.id.textRating, 2);
        sparseIntArray.put(R.id.textQuality, 3);
        sparseIntArray.put(R.id.textLastEpisode, 4);
        sparseIntArray.put(R.id.textTitle, 5);
    }

    @Override // W.g
    public final void a0() {
        synchronized (this) {
            this.f4118B = 0L;
        }
    }

    @Override // W.g
    public final boolean d0() {
        synchronized (this) {
            try {
                if (this.f4118B != 0) {
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
            this.f4118B = 1L;
        }
        h0();
    }
}
