package J1;

import android.util.SparseIntArray;
import co.notix.R;

/* loaded from: classes.dex */
public final class H0 extends G0 {

    /* renamed from: z, reason: collision with root package name */
    public static final SparseIntArray f3688z;

    /* renamed from: y, reason: collision with root package name */
    public long f3689y;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f3688z = sparseIntArray;
        sparseIntArray.put(R.id.textTitleWelcome, 1);
        sparseIntArray.put(R.id.textMessageWelcome, 2);
        sparseIntArray.put(R.id.buttonSignIn, 3);
        sparseIntArray.put(R.id.buttonWatchNow, 4);
    }

    @Override // W.g
    public final void a0() {
        synchronized (this) {
            this.f3689y = 0L;
        }
    }

    @Override // W.g
    public final boolean d0() {
        synchronized (this) {
            try {
                if (this.f3689y != 0) {
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
            this.f3689y = 1L;
        }
        h0();
    }
}
