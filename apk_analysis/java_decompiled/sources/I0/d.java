package I0;

import Y7.InterfaceC0484z;
import a.AbstractC0485a;

/* loaded from: classes.dex */
public final class d extends G7.j implements O7.p {

    /* renamed from: r, reason: collision with root package name */
    public kotlin.jvm.internal.o f3192r;

    /* renamed from: s, reason: collision with root package name */
    public int f3193s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.o f3194t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ k f3195u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(kotlin.jvm.internal.o oVar, k kVar, E7.d dVar) {
        super(2, dVar);
        this.f3194t = oVar;
        this.f3195u = kVar;
    }

    @Override // G7.a
    public final E7.d create(Object obj, E7.d dVar) {
        return new d(this.f3194t, this.f3195u, dVar);
    }

    @Override // O7.p
    public final Object invoke(Object obj, Object obj2) {
        return ((d) create((InterfaceC0484z) obj, (E7.d) obj2)).invokeSuspend(A7.n.f558a);
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        kotlin.jvm.internal.o oVar;
        F7.a aVar = F7.a.f2587a;
        int i9 = this.f3193s;
        if (i9 != 0) {
            if (i9 == 1) {
                oVar = this.f3192r;
                AbstractC0485a.A(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            AbstractC0485a.A(obj);
            kotlin.jvm.internal.o oVar2 = this.f3194t;
            this.f3192r = oVar2;
            this.f3193s = 1;
            Object a5 = this.f3195u.a(this);
            if (a5 == aVar) {
                return aVar;
            }
            oVar = oVar2;
            obj = a5;
        }
        oVar.f20159a = obj;
        return A7.n.f558a;
    }
}
