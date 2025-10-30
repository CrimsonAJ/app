package J1;

import android.util.SparseIntArray;
import co.notix.R;

/* loaded from: classes.dex */
public final class t1 extends s1 {

    /* renamed from: F, reason: collision with root package name */
    public static final SparseIntArray f4091F;

    /* renamed from: E, reason: collision with root package name */
    public long f4092E;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f4091F = sparseIntArray;
        sparseIntArray.put(R.id.imageReplyComment, 1);
        sparseIntArray.put(R.id.viewLine, 2);
        sparseIntArray.put(R.id.imageUser, 3);
        sparseIntArray.put(R.id.textUserName, 4);
        sparseIntArray.put(R.id.buttonMoreOption, 5);
        sparseIntArray.put(R.id.textComment, 6);
        sparseIntArray.put(R.id.buttonLike, 7);
        sparseIntArray.put(R.id.textNumberLike, 8);
        sparseIntArray.put(R.id.textTimeComment, 9);
    }

    @Override // W.g
    public final void a0() {
        synchronized (this) {
            this.f4092E = 0L;
        }
    }

    @Override // W.g
    public final boolean d0() {
        synchronized (this) {
            try {
                if (this.f4092E != 0) {
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
            this.f4092E = 1L;
        }
        h0();
    }
}
