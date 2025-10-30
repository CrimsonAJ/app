package I0;

import Y7.InterfaceC0484z;
import a.AbstractC0485a;

/* loaded from: classes.dex */
public final class f extends G7.j implements O7.p {

    /* renamed from: r, reason: collision with root package name */
    public int f3205r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ G7.j f3206s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ s f3207t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public f(O7.p pVar, s sVar, E7.d dVar) {
        super(2, dVar);
        this.f3206s = (G7.j) pVar;
        this.f3207t = sVar;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [G7.j, O7.p] */
    @Override // G7.a
    public final E7.d create(Object obj, E7.d dVar) {
        return new f(this.f3206s, this.f3207t, dVar);
    }

    @Override // O7.p
    public final Object invoke(Object obj, Object obj2) {
        return ((f) create((InterfaceC0484z) obj, (E7.d) obj2)).invokeSuspend(A7.n.f558a);
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [G7.j, O7.p] */
    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        F7.a aVar = F7.a.f2587a;
        int i9 = this.f3205r;
        if (i9 != 0) {
            if (i9 == 1) {
                AbstractC0485a.A(obj);
                return obj;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        AbstractC0485a.A(obj);
        this.f3205r = 1;
        Object invoke = this.f3206s.invoke(this.f3207t, this);
        if (invoke == aVar) {
            return aVar;
        }
        return invoke;
    }
}
