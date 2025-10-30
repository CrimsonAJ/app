package M1;

import a.AbstractC0485a;

/* loaded from: classes.dex */
public final class j extends G7.j implements O7.p {

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f4719r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ n f4720s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(n nVar, E7.d dVar) {
        super(2, dVar);
        this.f4720s = nVar;
    }

    @Override // G7.a
    public final E7.d create(Object obj, E7.d dVar) {
        j jVar = new j(this.f4720s, dVar);
        jVar.f4719r = obj;
        return jVar;
    }

    @Override // O7.p
    public final Object invoke(Object obj, Object obj2) {
        j jVar = (j) create((E) obj, (E7.d) obj2);
        A7.n nVar = A7.n.f558a;
        jVar.invokeSuspend(nVar);
        return nVar;
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        AbstractC0485a.A(obj);
        this.f4720s.o0((E) this.f4719r);
        return A7.n.f558a;
    }
}
