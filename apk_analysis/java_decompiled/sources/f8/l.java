package f8;

import Y7.AbstractC0480v;
import d8.AbstractC1130a;

/* loaded from: classes.dex */
public final class l extends AbstractC0480v {

    /* renamed from: b, reason: collision with root package name */
    public static final l f17482b = new AbstractC0480v();

    @Override // Y7.AbstractC0480v
    public final void g0(E7.i iVar, Runnable runnable) {
        e eVar = e.f17468c;
        eVar.f17470b.d(runnable, k.f17481h, false);
    }

    @Override // Y7.AbstractC0480v
    public final void h0(E7.i iVar, Runnable runnable) {
        e eVar = e.f17468c;
        eVar.f17470b.d(runnable, k.f17481h, true);
    }

    @Override // Y7.AbstractC0480v
    public final AbstractC0480v j0(int i9) {
        AbstractC1130a.a(i9);
        if (i9 >= k.f17477d) {
            return this;
        }
        return super.j0(i9);
    }
}
