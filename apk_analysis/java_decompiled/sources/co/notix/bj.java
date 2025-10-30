package co.notix;

import a.AbstractC0485a;

/* loaded from: classes.dex */
public final class bj extends G7.j implements O7.l {

    /* renamed from: a, reason: collision with root package name */
    public int f11940a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ej f11941b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bj(ej ejVar, E7.d dVar) {
        super(1, dVar);
        this.f11941b = ejVar;
    }

    @Override // G7.a
    public final E7.d create(E7.d dVar) {
        return new bj(this.f11941b, dVar);
    }

    @Override // O7.l
    public final Object invoke(Object obj) {
        return ((bj) create((E7.d) obj)).invokeSuspend(A7.n.f558a);
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        F7.a aVar = F7.a.f2587a;
        int i9 = this.f11940a;
        if (i9 != 0) {
            if (i9 == 1) {
                AbstractC0485a.A(obj);
                return obj;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        AbstractC0485a.A(obj);
        di diVar = this.f11941b.f12177a;
        this.f11940a = 1;
        Object a5 = diVar.a("worker", this);
        if (a5 == aVar) {
            return aVar;
        }
        return a5;
    }
}
