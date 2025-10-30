package b0;

import A7.n;
import B7.y;
import O7.p;
import a.AbstractC0485a;

/* loaded from: classes.dex */
public final class i extends G7.j implements p {

    /* renamed from: r, reason: collision with root package name */
    public int f10467r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f10468s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ G7.j f10469t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public i(p pVar, E7.d dVar) {
        super(2, dVar);
        this.f10469t = (G7.j) pVar;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [G7.j, O7.p] */
    @Override // G7.a
    public final E7.d create(Object obj, E7.d dVar) {
        i iVar = new i(this.f10469t, dVar);
        iVar.f10468s = obj;
        return iVar;
    }

    @Override // O7.p
    public final Object invoke(Object obj, Object obj2) {
        return ((i) create((C0584b) obj, (E7.d) obj2)).invokeSuspend(n.f558a);
    }

    /* JADX WARN: Type inference failed for: r5v5, types: [G7.j, O7.p] */
    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        F7.a aVar = F7.a.f2587a;
        int i9 = this.f10467r;
        if (i9 != 0) {
            if (i9 == 1) {
                C0584b c0584b = (C0584b) this.f10468s;
                AbstractC0485a.A(obj);
                return c0584b;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        AbstractC0485a.A(obj);
        C0584b c0584b2 = new C0584b(y.I(((C0584b) this.f10468s).a()), false);
        this.f10468s = c0584b2;
        this.f10467r = 1;
        if (this.f10469t.invoke(c0584b2, this) == aVar) {
            return aVar;
        }
        return c0584b2;
    }
}
