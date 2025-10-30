package J1;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import co.notix.R;

/* renamed from: J1.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0162b extends AbstractC0159a {

    /* renamed from: w, reason: collision with root package name */
    public static final SparseIntArray f3833w;

    /* renamed from: v, reason: collision with root package name */
    public long f3834v;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f3833w = sparseIntArray;
        sparseIntArray.put(R.id.nav_host, 1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0162b(View view) {
        super(null, view, 0);
        Object[] g02 = W.g.g0(view, 2, null, f3833w);
        this.f3834v = -1L;
        ((FrameLayout) g02[0]).setTag(null);
        j0(view);
        e0();
    }

    @Override // W.g
    public final void a0() {
        synchronized (this) {
            this.f3834v = 0L;
        }
    }

    @Override // W.g
    public final boolean d0() {
        synchronized (this) {
            try {
                if (this.f3834v != 0) {
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
            this.f3834v = 1L;
        }
        h0();
    }
}
