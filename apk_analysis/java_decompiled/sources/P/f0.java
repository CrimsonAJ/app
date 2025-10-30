package P;

import android.os.Build;
import android.view.animation.Interpolator;

/* loaded from: classes.dex */
public final class f0 {

    /* renamed from: a, reason: collision with root package name */
    public e0 f5595a;

    public f0(int i9, Interpolator interpolator, long j) {
        if (Build.VERSION.SDK_INT >= 30) {
            this.f5595a = new d0(C4.h.i(i9, interpolator, j));
        } else {
            this.f5595a = new e0(i9, interpolator, j);
        }
    }
}
