package P;

import android.graphics.Insets;
import android.view.View;
import android.view.WindowInsets;

/* loaded from: classes.dex */
public class p0 extends o0 {

    /* renamed from: r, reason: collision with root package name */
    public static final u0 f5633r;

    static {
        WindowInsets windowInsets;
        windowInsets = WindowInsets.CONSUMED;
        f5633r = u0.g(null, windowInsets);
    }

    public p0(u0 u0Var, WindowInsets windowInsets) {
        super(u0Var, windowInsets);
    }

    @Override // P.l0, P.r0
    public H.c f(int i9) {
        Insets insets;
        insets = this.f5623c.getInsets(s0.a(i9));
        return H.c.c(insets);
    }

    @Override // P.l0, P.r0
    public boolean o(int i9) {
        boolean isVisible;
        isVisible = this.f5623c.isVisible(s0.a(i9));
        return isVisible;
    }

    @Override // P.l0, P.r0
    public final void d(View view) {
    }
}
