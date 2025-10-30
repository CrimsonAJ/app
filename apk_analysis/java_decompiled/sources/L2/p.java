package L2;

import Y7.InterfaceC0484z;
import a.AbstractC0485a;

/* loaded from: classes.dex */
public final class p extends G7.j implements O7.p {
    @Override // G7.a
    public final E7.d create(Object obj, E7.d dVar) {
        return new G7.j(2, dVar);
    }

    @Override // O7.p
    public final Object invoke(Object obj, Object obj2) {
        return ((p) create((InterfaceC0484z) obj, (E7.d) obj2)).invokeSuspend(A7.n.f558a);
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        AbstractC0485a.A(obj);
        return g6.o.f17761a.A();
    }
}
