package G0;

import a.AbstractC0485a;

/* loaded from: classes.dex */
public final class O extends G7.j implements O7.p {

    /* renamed from: r, reason: collision with root package name */
    public int f2684r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f2685s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ X f2686t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public O(X x5, E7.d dVar) {
        super(2, dVar);
        this.f2686t = x5;
    }

    @Override // G7.a
    public final E7.d create(Object obj, E7.d dVar) {
        O o9 = new O(this.f2686t, dVar);
        o9.f2685s = obj;
        return o9;
    }

    @Override // O7.p
    public final Object invoke(Object obj, Object obj2) {
        return ((O) create((I0.m) obj, (E7.d) obj2)).invokeSuspend(A7.n.f558a);
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        F7.a aVar = F7.a.f2587a;
        int i9 = this.f2684r;
        if (i9 != 0) {
            if (i9 == 1) {
                AbstractC0485a.A(obj);
                return obj;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        AbstractC0485a.A(obj);
        I0.m mVar = (I0.m) this.f2685s;
        this.f2684r = 1;
        Object a5 = X.a(this.f2686t, mVar, this);
        if (a5 == aVar) {
            return aVar;
        }
        return a5;
    }
}
