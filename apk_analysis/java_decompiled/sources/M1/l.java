package M1;

import Y7.InterfaceC0484z;
import a.AbstractC0485a;

/* loaded from: classes.dex */
public final class l extends G7.j implements O7.p {

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f4723r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ n f4724s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(n nVar, E7.d dVar) {
        super(2, dVar);
        this.f4724s = nVar;
    }

    @Override // G7.a
    public final E7.d create(Object obj, E7.d dVar) {
        l lVar = new l(this.f4724s, dVar);
        lVar.f4723r = obj;
        return lVar;
    }

    @Override // O7.p
    public final Object invoke(Object obj, Object obj2) {
        l lVar = (l) create((InterfaceC0484z) obj, (E7.d) obj2);
        A7.n nVar = A7.n.f558a;
        lVar.invokeSuspend(nVar);
        return nVar;
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        AbstractC0485a.A(obj);
        InterfaceC0484z interfaceC0484z = (InterfaceC0484z) this.f4723r;
        n nVar = this.f4724s;
        Y7.B.r(interfaceC0484z, null, new i(nVar, null), 3);
        Y7.B.r(interfaceC0484z, null, new k(nVar, null), 3);
        return A7.n.f558a;
    }
}
