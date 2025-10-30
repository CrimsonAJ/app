package P;

import android.view.WindowInsets;

/* loaded from: classes.dex */
public class h0 extends k0 {

    /* renamed from: c, reason: collision with root package name */
    public final WindowInsets.Builder f5610c;

    public h0() {
        this.f5610c = B.a.g();
    }

    @Override // P.k0
    public u0 b() {
        WindowInsets build;
        a();
        build = this.f5610c.build();
        u0 g9 = u0.g(null, build);
        g9.f5645a.p(this.f5613b);
        return g9;
    }

    @Override // P.k0
    public void d(H.c cVar) {
        this.f5610c.setMandatorySystemGestureInsets(cVar.d());
    }

    @Override // P.k0
    public void e(H.c cVar) {
        this.f5610c.setStableInsets(cVar.d());
    }

    @Override // P.k0
    public void f(H.c cVar) {
        this.f5610c.setSystemGestureInsets(cVar.d());
    }

    @Override // P.k0
    public void g(H.c cVar) {
        this.f5610c.setSystemWindowInsets(cVar.d());
    }

    @Override // P.k0
    public void h(H.c cVar) {
        this.f5610c.setTappableElementInsets(cVar.d());
    }

    public h0(u0 u0Var) {
        super(u0Var);
        WindowInsets.Builder g9;
        WindowInsets f9 = u0Var.f();
        if (f9 != null) {
            g9 = B.a.h(f9);
        } else {
            g9 = B.a.g();
        }
        this.f5610c = g9;
    }
}
