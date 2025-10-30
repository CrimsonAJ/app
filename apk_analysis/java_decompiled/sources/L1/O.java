package L1;

import Y7.InterfaceC0484z;
import a.AbstractC0485a;

/* loaded from: classes.dex */
public final class O extends G7.j implements O7.p {

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ S f4483r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ String f4484s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public O(S s9, String str, E7.d dVar) {
        super(2, dVar);
        this.f4483r = s9;
        this.f4484s = str;
    }

    @Override // G7.a
    public final E7.d create(Object obj, E7.d dVar) {
        return new O(this.f4483r, this.f4484s, dVar);
    }

    @Override // O7.p
    public final Object invoke(Object obj, Object obj2) {
        O o9 = (O) create((InterfaceC0484z) obj, (E7.d) obj2);
        A7.n nVar = A7.n.f558a;
        o9.invokeSuspend(nVar);
        return nVar;
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        AbstractC0485a.A(obj);
        this.f4483r.f4496i.a(this.f4484s);
        return A7.n.f558a;
    }
}
