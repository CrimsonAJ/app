package Y7;

import a.AbstractC0485a;

/* loaded from: classes.dex */
public final class N extends l0 {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f8776e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f8777f;

    public /* synthetic */ N(int i9, Object obj) {
        this.f8776e = i9;
        this.f8777f = obj;
    }

    @Override // Y7.InterfaceC0457d0
    public final void d(Throwable th) {
        switch (this.f8776e) {
            case 0:
                ((M) this.f8777f).b();
                return;
            case 1:
                ((InterfaceC0457d0) this.f8777f).d(th);
                return;
            case 2:
                Object D8 = k().D();
                boolean z9 = D8 instanceof C0476q;
                m0 m0Var = (m0) this.f8777f;
                if (z9) {
                    m0Var.resumeWith(AbstractC0485a.h(((C0476q) D8).f8842a));
                    return;
                } else {
                    m0Var.resumeWith(B.A(D8));
                    return;
                }
            default:
                ((C0464h) this.f8777f).resumeWith(A7.n.f558a);
                return;
        }
    }
}
