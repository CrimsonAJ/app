package J1;

import android.util.SparseIntArray;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import co.notix.R;

/* renamed from: J1.z, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0213z extends AbstractC0211y {

    /* renamed from: x, reason: collision with root package name */
    public static final SparseIntArray f4145x;

    /* renamed from: w, reason: collision with root package name */
    public long f4146w;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f4145x = sparseIntArray;
        sparseIntArray.put(R.id.imageView, 1);
        sparseIntArray.put(R.id.textCongratulation, 2);
        sparseIntArray.put(R.id.textMessage, 3);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0213z(View view) {
        super(null, view, 0);
        Object[] g02 = W.g.g0(view, 4, null, f4145x);
        this.f4146w = -1L;
        ((ConstraintLayout) g02[0]).setTag(null);
        j0(view);
        e0();
    }

    @Override // W.g
    public final void a0() {
        synchronized (this) {
            this.f4146w = 0L;
        }
    }

    @Override // W.g
    public final boolean d0() {
        synchronized (this) {
            try {
                if (this.f4146w != 0) {
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
            this.f4146w = 1L;
        }
        h0();
    }
}
