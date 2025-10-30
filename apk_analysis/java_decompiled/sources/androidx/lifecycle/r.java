package androidx.lifecycle;

import Y7.C0463g0;
import Y7.InterfaceC0465h0;
import Y7.InterfaceC0484z;

/* loaded from: classes.dex */
public final class r implements InterfaceC0559u, InterfaceC0484z {

    /* renamed from: a, reason: collision with root package name */
    public final D.n f9901a;

    /* renamed from: b, reason: collision with root package name */
    public final E7.i f9902b;

    public r(D.n nVar, E7.i coroutineContext) {
        InterfaceC0465h0 interfaceC0465h0;
        kotlin.jvm.internal.h.e(coroutineContext, "coroutineContext");
        this.f9901a = nVar;
        this.f9902b = coroutineContext;
        if (nVar.a0() == EnumC0555p.f9893a && (interfaceC0465h0 = (InterfaceC0465h0) coroutineContext.get(C0463g0.f8811a)) != null) {
            interfaceC0465h0.d(null);
        }
    }

    @Override // androidx.lifecycle.InterfaceC0559u
    public final void d(InterfaceC0561w interfaceC0561w, EnumC0554o enumC0554o) {
        D.n nVar = this.f9901a;
        if (nVar.a0().compareTo(EnumC0555p.f9893a) <= 0) {
            nVar.g0(this);
            InterfaceC0465h0 interfaceC0465h0 = (InterfaceC0465h0) this.f9902b.get(C0463g0.f8811a);
            if (interfaceC0465h0 != null) {
                interfaceC0465h0.d(null);
            }
        }
    }

    @Override // Y7.InterfaceC0484z
    public final E7.i g() {
        return this.f9902b;
    }
}
