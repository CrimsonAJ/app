package P;

import android.graphics.Insets;
import android.view.WindowInsets;

/* loaded from: classes.dex */
public final class q0 extends p0 {

    /* renamed from: s, reason: collision with root package name */
    public static final u0 f5637s;

    static {
        WindowInsets windowInsets;
        windowInsets = WindowInsets.CONSUMED;
        f5637s = u0.g(null, windowInsets);
    }

    public q0(u0 u0Var, WindowInsets windowInsets) {
        super(u0Var, windowInsets);
    }

    @Override // P.p0, P.l0, P.r0
    public H.c f(int i9) {
        Insets insets;
        insets = this.f5623c.getInsets(t0.a(i9));
        return H.c.c(insets);
    }

    @Override // P.p0, P.l0, P.r0
    public boolean o(int i9) {
        boolean isVisible;
        isVisible = this.f5623c.isVisible(t0.a(i9));
        return isVisible;
    }
}
