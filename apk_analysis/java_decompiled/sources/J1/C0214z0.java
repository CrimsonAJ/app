package J1;

import android.util.SparseIntArray;
import co.notix.R;

/* renamed from: J1.z0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0214z0 extends AbstractC0212y0 {

    /* renamed from: E, reason: collision with root package name */
    public static final SparseIntArray f4147E;

    /* renamed from: D, reason: collision with root package name */
    public long f4148D;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f4147E = sparseIntArray;
        sparseIntArray.put(R.id.layoutHeader, 1);
        sparseIntArray.put(R.id.tabLayoutDub, 2);
        sparseIntArray.put(R.id.tabSub, 3);
        sparseIntArray.put(R.id.tabDub, 4);
        sparseIntArray.put(R.id.indicator, 5);
        sparseIntArray.put(R.id.scrollViewServer, 6);
        sparseIntArray.put(R.id.chipGroupServer, 7);
        sparseIntArray.put(R.id.progressBar, 8);
        sparseIntArray.put(R.id.recyclerSubtitle, 9);
        sparseIntArray.put(R.id.buttonBack, 10);
        sparseIntArray.put(R.id.buttonSelectAndPlay, 11);
    }

    @Override // W.g
    public final void a0() {
        synchronized (this) {
            this.f4148D = 0L;
        }
    }

    @Override // W.g
    public final boolean d0() {
        synchronized (this) {
            try {
                if (this.f4148D != 0) {
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
            this.f4148D = 1L;
        }
        h0();
    }
}
