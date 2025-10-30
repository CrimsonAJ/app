package J1;

import android.util.SparseIntArray;
import co.notix.R;

/* loaded from: classes.dex */
public final class l1 extends k1 {

    /* renamed from: D, reason: collision with root package name */
    public static final SparseIntArray f3988D;

    /* renamed from: C, reason: collision with root package name */
    public long f3989C;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f3988D = sparseIntArray;
        sparseIntArray.put(R.id.viewBackgroundSelected, 1);
        sparseIntArray.put(R.id.imagePlayerLogo, 2);
        sparseIntArray.put(R.id.textName, 3);
        sparseIntArray.put(R.id.textRecommend, 4);
        sparseIntArray.put(R.id.appCompatTextView, 5);
        sparseIntArray.put(R.id.ratingBar, 6);
        sparseIntArray.put(R.id.viewDotSelected, 7);
    }

    @Override // W.g
    public final void a0() {
        synchronized (this) {
            this.f3989C = 0L;
        }
    }

    @Override // W.g
    public final boolean d0() {
        synchronized (this) {
            try {
                if (this.f3989C != 0) {
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
            this.f3989C = 1L;
        }
        h0();
    }
}
