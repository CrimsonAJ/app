package L1;

import Y7.InterfaceC0484z;
import a.AbstractC0485a;

/* loaded from: classes.dex */
public final class J extends G7.j implements O7.p {

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ S f4466r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ H2.u f4467s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public J(S s9, H2.u uVar, E7.d dVar) {
        super(2, dVar);
        this.f4466r = s9;
        this.f4467s = uVar;
    }

    @Override // G7.a
    public final E7.d create(Object obj, E7.d dVar) {
        return new J(this.f4466r, this.f4467s, dVar);
    }

    @Override // O7.p
    public final Object invoke(Object obj, Object obj2) {
        J j = (J) create((InterfaceC0484z) obj, (E7.d) obj2);
        A7.n nVar = A7.n.f558a;
        j.invokeSuspend(nVar);
        return nVar;
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        AbstractC0485a.A(obj);
        S s9 = this.f4466r;
        s9.f4498l.a(this.f4467s);
        s9.d(false, new P(b2.m.f10499d, false, s9, null));
        return A7.n.f558a;
    }
}
