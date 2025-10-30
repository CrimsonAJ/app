package J1;

import android.util.SparseIntArray;
import android.view.View;
import androidx.appcompat.widget.LinearLayoutCompat;
import co.notix.R;

/* renamed from: J1.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0174f extends AbstractC0171e {

    /* renamed from: w, reason: collision with root package name */
    public static final SparseIntArray f3917w;

    /* renamed from: v, reason: collision with root package name */
    public long f3918v;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f3917w = sparseIntArray;
        sparseIntArray.put(R.id.textMessageLogout, 1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0174f(View view) {
        super(null, view, 0);
        Object[] g02 = W.g.g0(view, 2, null, f3917w);
        this.f3918v = -1L;
        ((LinearLayoutCompat) g02[0]).setTag(null);
        j0(view);
        e0();
    }

    @Override // W.g
    public final void a0() {
        synchronized (this) {
            this.f3918v = 0L;
        }
    }

    @Override // W.g
    public final boolean d0() {
        synchronized (this) {
            try {
                if (this.f3918v != 0) {
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
            this.f3918v = 1L;
        }
        h0();
    }
}
