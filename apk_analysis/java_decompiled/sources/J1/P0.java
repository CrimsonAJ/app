package J1;

import android.util.SparseIntArray;
import co.notix.R;

/* loaded from: classes.dex */
public final class P0 extends O0 {

    /* renamed from: H, reason: collision with root package name */
    public static final SparseIntArray f3755H;

    /* renamed from: G, reason: collision with root package name */
    public long f3756G;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f3755H = sparseIntArray;
        sparseIntArray.put(R.id.buttonReply, 1);
        sparseIntArray.put(R.id.textReply, 2);
        sparseIntArray.put(R.id.buttonNumberReply, 3);
        sparseIntArray.put(R.id.imageUser, 4);
        sparseIntArray.put(R.id.textUserName, 5);
        sparseIntArray.put(R.id.buttonMoreOption, 6);
        sparseIntArray.put(R.id.textComment, 7);
        sparseIntArray.put(R.id.buttonLike, 8);
        sparseIntArray.put(R.id.textNumberLike, 9);
        sparseIntArray.put(R.id.textTimeComment, 10);
    }

    @Override // W.g
    public final void a0() {
        synchronized (this) {
            this.f3756G = 0L;
        }
    }

    @Override // W.g
    public final boolean d0() {
        synchronized (this) {
            try {
                if (this.f3756G != 0) {
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
            this.f3756G = 1L;
        }
        h0();
    }
}
