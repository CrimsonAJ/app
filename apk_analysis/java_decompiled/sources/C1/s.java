package C1;

import Y7.InterfaceC0484z;
import a.AbstractC0485a;
import u0.z;

/* loaded from: classes.dex */
public final class s extends G7.j implements O7.p {

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ t f1248r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(t tVar, E7.d dVar) {
        super(2, dVar);
        this.f1248r = tVar;
    }

    @Override // G7.a
    public final E7.d create(Object obj, E7.d dVar) {
        return new s(this.f1248r, dVar);
    }

    @Override // O7.p
    public final Object invoke(Object obj, Object obj2) {
        s sVar = (s) create((InterfaceC0484z) obj, (E7.d) obj2);
        A7.n nVar = A7.n.f558a;
        sVar.invokeSuspend(nVar);
        return nVar;
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        AbstractC0485a.A(obj);
        t tVar = this.f1248r;
        r rVar = tVar.f1252d;
        if (rVar != null) {
            rVar.f1247e.d(null);
            E1.a aVar = rVar.f1245c;
            boolean i9 = z.i(aVar);
            D.n nVar = rVar.f1246d;
            if (i9) {
                nVar.g0(aVar);
            }
            nVar.g0(rVar);
        }
        tVar.f1252d = null;
        return A7.n.f558a;
    }
}
