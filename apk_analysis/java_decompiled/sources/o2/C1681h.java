package o2;

import Y7.InterfaceC0484z;
import a.AbstractC0485a;
import b8.C0718Q;

/* renamed from: o2.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1681h extends G7.j implements O7.p {

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ C1683j f21528r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1681h(C1683j c1683j, E7.d dVar) {
        super(2, dVar);
        this.f21528r = c1683j;
    }

    @Override // G7.a
    public final E7.d create(Object obj, E7.d dVar) {
        return new C1681h(this.f21528r, dVar);
    }

    @Override // O7.p
    public final Object invoke(Object obj, Object obj2) {
        C1681h c1681h = (C1681h) create((InterfaceC0484z) obj, (E7.d) obj2);
        A7.n nVar = A7.n.f558a;
        c1681h.invokeSuspend(nVar);
        return nVar;
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        AbstractC0485a.A(obj);
        C1683j c1683j = this.f21528r;
        C0718Q c0718q = c1683j.f21532g;
        Boolean valueOf = Boolean.valueOf(c1683j.f21531f.a());
        c0718q.getClass();
        c0718q.j(null, valueOf);
        return A7.n.f558a;
    }
}
