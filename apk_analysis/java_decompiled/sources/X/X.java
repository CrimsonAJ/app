package X;

import a.AbstractC0485a;
import b8.InterfaceC0726f;

/* loaded from: classes.dex */
public final class X extends G7.j implements O7.p {
    @Override // G7.a
    public final E7.d create(Object obj, E7.d dVar) {
        return new G7.j(2, dVar);
    }

    @Override // O7.p
    public final Object invoke(Object obj, Object obj2) {
        X x5 = (X) create((InterfaceC0726f) obj, (E7.d) obj2);
        A7.n nVar = A7.n.f558a;
        x5.invokeSuspend(nVar);
        return nVar;
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        AbstractC0485a.A(obj);
        return A7.n.f558a;
    }
}
