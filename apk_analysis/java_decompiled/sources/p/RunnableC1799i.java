package p;

import android.view.View;

/* renamed from: p.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC1799i implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final C1795g f21996a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C1805l f21997b;

    public RunnableC1799i(C1805l c1805l, C1795g c1795g) {
        this.f21997b = c1805l;
        this.f21996a = c1795g;
    }

    @Override // java.lang.Runnable
    public final void run() {
        o.j jVar;
        C1805l c1805l = this.f21997b;
        o.l lVar = c1805l.f22009c;
        if (lVar != null && (jVar = lVar.f21379e) != null) {
            jVar.u(lVar);
        }
        View view = (View) c1805l.f22014h;
        if (view != null && view.getWindowToken() != null) {
            C1795g c1795g = this.f21996a;
            if (!c1795g.b()) {
                if (c1795g.f21445e != null) {
                    c1795g.d(0, 0, false, false);
                }
            }
            c1805l.f22025t = c1795g;
        }
        c1805l.f22027v = null;
    }
}
