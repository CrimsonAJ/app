package J1;

import android.util.SparseIntArray;
import co.notix.R;

/* loaded from: classes.dex */
public final class B1 extends AbstractC0171e {

    /* renamed from: w, reason: collision with root package name */
    public static final SparseIntArray f3617w;

    /* renamed from: v, reason: collision with root package name */
    public long f3618v;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f3617w = sparseIntArray;
        sparseIntArray.put(R.id.textTitle, 1);
        sparseIntArray.put(R.id.horizontalScrollView2, 2);
        sparseIntArray.put(R.id.chipGroup, 3);
        sparseIntArray.put(R.id.recyclerRow, 4);
    }

    @Override // W.g
    public final void a0() {
        synchronized (this) {
            this.f3618v = 0L;
        }
    }

    @Override // W.g
    public final boolean d0() {
        synchronized (this) {
            try {
                if (this.f3618v != 0) {
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
            this.f3618v = 1L;
        }
        h0();
    }
}
