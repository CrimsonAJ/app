package M1;

import a.AbstractC0485a;

/* loaded from: classes.dex */
public final class h extends G7.j implements O7.p {

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ boolean f4715r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ n f4716s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(n nVar, E7.d dVar) {
        super(2, dVar);
        this.f4716s = nVar;
    }

    @Override // G7.a
    public final E7.d create(Object obj, E7.d dVar) {
        h hVar = new h(this.f4716s, dVar);
        hVar.f4715r = ((Boolean) obj).booleanValue();
        return hVar;
    }

    @Override // O7.p
    public final Object invoke(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        h hVar = (h) create(bool, (E7.d) obj2);
        A7.n nVar = A7.n.f558a;
        hVar.invokeSuspend(nVar);
        return nVar;
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        AbstractC0485a.A(obj);
        this.f4716s.n0(this.f4715r);
        return A7.n.f558a;
    }
}
