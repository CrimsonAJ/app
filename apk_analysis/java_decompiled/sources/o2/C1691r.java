package o2;

import Y7.InterfaceC0484z;
import a.AbstractC0485a;

/* renamed from: o2.r, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1691r extends G7.j implements O7.p {

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ C1692s f21547r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1691r(C1692s c1692s, E7.d dVar) {
        super(2, dVar);
        this.f21547r = c1692s;
    }

    @Override // G7.a
    public final E7.d create(Object obj, E7.d dVar) {
        return new C1691r(this.f21547r, dVar);
    }

    @Override // O7.p
    public final Object invoke(Object obj, Object obj2) {
        C1691r c1691r = (C1691r) create((InterfaceC0484z) obj, (E7.d) obj2);
        A7.n nVar = A7.n.f558a;
        c1691r.invokeSuspend(nVar);
        return nVar;
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        AbstractC0485a.A(obj);
        C1692s c1692s = this.f21547r;
        c1692s.f21548f.a(c1692s.f21549g);
        return A7.n.f558a;
    }
}
