package C0;

import A7.n;
import O7.p;
import Y7.InterfaceC0484z;
import a.AbstractC0485a;

/* loaded from: classes.dex */
public final class f extends G7.j implements p {

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f1150r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ g f1151s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(g gVar, E7.d dVar) {
        super(2, dVar);
        this.f1151s = gVar;
    }

    @Override // G7.a
    public final E7.d create(Object obj, E7.d dVar) {
        f fVar = new f(this.f1151s, dVar);
        fVar.f1150r = obj;
        return fVar;
    }

    @Override // O7.p
    public final Object invoke(Object obj, Object obj2) {
        ((f) create((InterfaceC0484z) obj, (E7.d) obj2)).invokeSuspend(n.f558a);
        throw null;
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        AbstractC0485a.A(obj);
        throw null;
    }
}
