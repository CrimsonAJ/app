package X;

import a.AbstractC0485a;

/* loaded from: classes.dex */
public final class L extends G7.j implements O7.p {

    /* renamed from: r, reason: collision with root package name */
    public int f7997r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f7998s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ O f7999t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public L(O o9, E7.d dVar) {
        super(2, dVar);
        this.f7999t = o9;
    }

    @Override // G7.a
    public final E7.d create(Object obj, E7.d dVar) {
        L l9 = new L(this.f7999t, dVar);
        l9.f7998s = obj;
        return l9;
    }

    @Override // O7.p
    public final Object invoke(Object obj, Object obj2) {
        return ((L) create((Q) obj, (E7.d) obj2)).invokeSuspend(A7.n.f558a);
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        F7.a aVar = F7.a.f2587a;
        int i9 = this.f7997r;
        if (i9 != 0) {
            if (i9 == 1) {
                AbstractC0485a.A(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            AbstractC0485a.A(obj);
            Q q9 = (Q) this.f7998s;
            this.f7997r = 1;
            if (O.d(this.f7999t, q9, this) == aVar) {
                return aVar;
            }
        }
        return A7.n.f558a;
    }
}
