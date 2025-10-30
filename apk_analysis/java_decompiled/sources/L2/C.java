package L2;

import Y7.InterfaceC0484z;
import Y7.K;
import a.AbstractC0485a;
import x2.C2168a;

/* loaded from: classes.dex */
public final class C extends G7.j implements O7.p {

    /* renamed from: r, reason: collision with root package name */
    public int f4581r;

    @Override // G7.a
    public final E7.d create(Object obj, E7.d dVar) {
        return new G7.j(2, dVar);
    }

    @Override // O7.p
    public final Object invoke(Object obj, Object obj2) {
        return ((C) create((InterfaceC0484z) obj, (E7.d) obj2)).invokeSuspend(A7.n.f558a);
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        F7.a aVar = F7.a.f2587a;
        int i9 = this.f4581r;
        if (i9 != 0) {
            if (i9 == 1) {
                AbstractC0485a.A(obj);
                return obj;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        AbstractC0485a.A(obj);
        String E8 = g6.o.f17761a.E();
        this.f4581r = 1;
        Object C8 = Y7.B.C(K.f8774b, new C2168a(E8, null), this);
        if (C8 == aVar) {
            return aVar;
        }
        return C8;
    }
}
