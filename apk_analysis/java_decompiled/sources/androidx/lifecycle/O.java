package androidx.lifecycle;

import Y7.InterfaceC0484z;
import a.AbstractC0485a;

/* loaded from: classes.dex */
public final class O extends G7.j implements O7.p {

    /* renamed from: r, reason: collision with root package name */
    public int f9831r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f9832s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ D.n f9833t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ EnumC0555p f9834u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ G7.j f9835v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public O(D.n nVar, EnumC0555p enumC0555p, O7.p pVar, E7.d dVar) {
        super(2, dVar);
        this.f9833t = nVar;
        this.f9834u = enumC0555p;
        this.f9835v = (G7.j) pVar;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [G7.j, O7.p] */
    @Override // G7.a
    public final E7.d create(Object obj, E7.d dVar) {
        O o9 = new O(this.f9833t, this.f9834u, this.f9835v, dVar);
        o9.f9832s = obj;
        return o9;
    }

    @Override // O7.p
    public final Object invoke(Object obj, Object obj2) {
        return ((O) create((InterfaceC0484z) obj, (E7.d) obj2)).invokeSuspend(A7.n.f558a);
    }

    /* JADX WARN: Type inference failed for: r7v0, types: [G7.j, O7.p] */
    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        F7.a aVar = F7.a.f2587a;
        int i9 = this.f9831r;
        if (i9 != 0) {
            if (i9 == 1) {
                AbstractC0485a.A(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            AbstractC0485a.A(obj);
            InterfaceC0484z interfaceC0484z = (InterfaceC0484z) this.f9832s;
            f8.e eVar = Y7.K.f8773a;
            Z7.d dVar = d8.o.f17003a.f9070d;
            N n7 = new N(this.f9833t, this.f9834u, interfaceC0484z, this.f9835v, null);
            this.f9831r = 1;
            if (Y7.B.C(dVar, n7, this) == aVar) {
                return aVar;
            }
        }
        return A7.n.f558a;
    }
}
