package i0;

import B6.u0;
import android.os.Handler;
import android.view.View;
import android.view.Window;
import androidx.lifecycle.InterfaceC0561w;
import androidx.lifecycle.j0;
import androidx.lifecycle.k0;

/* renamed from: i0.x, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1368x extends u0 implements k0, InterfaceC0561w, N0.g, InterfaceC1341S {

    /* renamed from: n, reason: collision with root package name */
    public final AbstractActivityC1369y f18426n;

    /* renamed from: o, reason: collision with root package name */
    public final AbstractActivityC1369y f18427o;

    /* renamed from: p, reason: collision with root package name */
    public final Handler f18428p;

    /* renamed from: q, reason: collision with root package name */
    public final C1337N f18429q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ AbstractActivityC1369y f18430r;

    /* JADX WARN: Type inference failed for: r1v0, types: [i0.M, i0.N] */
    public C1368x(AbstractActivityC1369y abstractActivityC1369y) {
        this.f18430r = abstractActivityC1369y;
        Handler handler = new Handler();
        this.f18429q = new AbstractC1336M();
        this.f18426n = abstractActivityC1369y;
        this.f18427o = abstractActivityC1369y;
        this.f18428p = handler;
    }

    @Override // B6.u0
    public final View G(int i9) {
        return this.f18430r.findViewById(i9);
    }

    @Override // B6.u0
    public final boolean H() {
        Window window = this.f18430r.getWindow();
        if (window != null && window.peekDecorView() != null) {
            return true;
        }
        return false;
    }

    @Override // i0.InterfaceC1341S
    public final void a(AbstractC1336M abstractC1336M, AbstractComponentCallbacksC1366v abstractComponentCallbacksC1366v) {
        this.f18430r.getClass();
    }

    @Override // N0.g
    public final N0.f c() {
        return (N0.f) this.f18430r.f16589e.f15188c;
    }

    @Override // androidx.lifecycle.k0
    public final j0 u() {
        return this.f18430r.u();
    }

    @Override // androidx.lifecycle.InterfaceC0561w
    public final D.n x() {
        return this.f18430r.f18432u;
    }
}
