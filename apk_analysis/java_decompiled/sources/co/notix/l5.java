package co.notix;

import a.AbstractC0485a;

/* loaded from: classes.dex */
public final class l5 extends G7.j implements O7.l {

    /* renamed from: a, reason: collision with root package name */
    public int f12680a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m5 f12681b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l5(m5 m5Var, E7.d dVar) {
        super(1, dVar);
        this.f12681b = m5Var;
    }

    @Override // G7.a
    public final E7.d create(E7.d dVar) {
        return new l5(this.f12681b, dVar);
    }

    @Override // O7.l
    public final Object invoke(Object obj) {
        return ((l5) create((E7.d) obj)).invokeSuspend(A7.n.f558a);
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        F7.a aVar = F7.a.f2587a;
        int i9 = this.f12680a;
        if (i9 != 0) {
            if (i9 == 1) {
                AbstractC0485a.A(obj);
                return obj;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        AbstractC0485a.A(obj);
        di diVar = this.f12681b.f12760a;
        this.f12680a = 1;
        Object a5 = diVar.a("ad", this);
        if (a5 == aVar) {
            return aVar;
        }
        return a5;
    }
}
