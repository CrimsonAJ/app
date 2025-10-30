package co.notix;

import a.AbstractC0485a;

/* loaded from: classes.dex */
public final class mn extends G7.j implements O7.l {

    /* renamed from: a, reason: collision with root package name */
    public int f12794a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ vn f12795b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mn(vn vnVar, E7.d dVar) {
        super(1, dVar);
        this.f12795b = vnVar;
    }

    @Override // G7.a
    public final E7.d create(E7.d dVar) {
        return new mn(this.f12795b, dVar);
    }

    @Override // O7.l
    public final Object invoke(Object obj) {
        return ((mn) create((E7.d) obj)).invokeSuspend(A7.n.f558a);
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        F7.a aVar = F7.a.f2587a;
        int i9 = this.f12794a;
        if (i9 != 0) {
            if (i9 == 1) {
                AbstractC0485a.A(obj);
                return obj;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        AbstractC0485a.A(obj);
        di diVar = this.f12795b.f13381a;
        this.f12794a = 1;
        Object a5 = diVar.a("logs", this);
        if (a5 == aVar) {
            return aVar;
        }
        return a5;
    }
}
