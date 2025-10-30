package P;

import android.view.WindowInsets;

/* loaded from: classes.dex */
public class m0 extends l0 {

    /* renamed from: n, reason: collision with root package name */
    public H.c f5629n;

    public m0(u0 u0Var, WindowInsets windowInsets) {
        super(u0Var, windowInsets);
        this.f5629n = null;
    }

    @Override // P.r0
    public u0 b() {
        return u0.g(null, this.f5623c.consumeStableInsets());
    }

    @Override // P.r0
    public u0 c() {
        return u0.g(null, this.f5623c.consumeSystemWindowInsets());
    }

    @Override // P.r0
    public final H.c h() {
        if (this.f5629n == null) {
            WindowInsets windowInsets = this.f5623c;
            this.f5629n = H.c.b(windowInsets.getStableInsetLeft(), windowInsets.getStableInsetTop(), windowInsets.getStableInsetRight(), windowInsets.getStableInsetBottom());
        }
        return this.f5629n;
    }

    @Override // P.r0
    public boolean m() {
        return this.f5623c.isConsumed();
    }

    @Override // P.r0
    public void r(H.c cVar) {
        this.f5629n = cVar;
    }
}
