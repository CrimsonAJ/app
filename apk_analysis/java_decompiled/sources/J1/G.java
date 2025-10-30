package J1;

import android.util.SparseIntArray;
import co.notix.R;

/* loaded from: classes.dex */
public final class G extends AbstractC0171e {

    /* renamed from: w, reason: collision with root package name */
    public static final SparseIntArray f3674w;

    /* renamed from: v, reason: collision with root package name */
    public long f3675v;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f3674w = sparseIntArray;
        sparseIntArray.put(R.id.buttonWebsite, 1);
        sparseIntArray.put(R.id.buttonTwitter, 2);
        sparseIntArray.put(R.id.buttonTelegram, 3);
    }

    @Override // W.g
    public final void a0() {
        synchronized (this) {
            this.f3675v = 0L;
        }
    }

    @Override // W.g
    public final boolean d0() {
        synchronized (this) {
            try {
                if (this.f3675v != 0) {
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
            this.f3675v = 1L;
        }
        h0();
    }
}
