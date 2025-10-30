package b2;

import Y7.InterfaceC0484z;
import a.AbstractC0485a;

/* renamed from: b2.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0598k extends G7.j implements O7.p {

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ C0599l f10491r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0598k(C0599l c0599l, E7.d dVar) {
        super(2, dVar);
        this.f10491r = c0599l;
    }

    @Override // G7.a
    public final E7.d create(Object obj, E7.d dVar) {
        return new C0598k(this.f10491r, dVar);
    }

    @Override // O7.p
    public final Object invoke(Object obj, Object obj2) {
        C0598k c0598k = (C0598k) create((InterfaceC0484z) obj, (E7.d) obj2);
        A7.n nVar = A7.n.f558a;
        c0598k.invokeSuspend(nVar);
        return nVar;
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        AbstractC0485a.A(obj);
        C0599l c0599l = this.f10491r;
        c0599l.f10495i.i(c0599l.f10492f.a());
        return A7.n.f558a;
    }
}
