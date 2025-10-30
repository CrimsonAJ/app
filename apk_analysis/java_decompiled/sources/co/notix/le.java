package co.notix;

import a.AbstractC0485a;

/* loaded from: classes.dex */
public final class le extends G7.j implements O7.p {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ boolean f12703a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ te f12704b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public le(te teVar, E7.d dVar) {
        super(2, dVar);
        this.f12704b = teVar;
    }

    @Override // G7.a
    public final E7.d create(Object obj, E7.d dVar) {
        le leVar = new le(this.f12704b, dVar);
        leVar.f12703a = ((Boolean) obj).booleanValue();
        return leVar;
    }

    @Override // O7.p
    public final Object invoke(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        return ((le) create(bool, (E7.d) obj2)).invokeSuspend(A7.n.f558a);
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        AbstractC0485a.A(obj);
        if (this.f12703a) {
            te.a(this.f12704b);
        } else {
            te.b(this.f12704b);
        }
        return A7.n.f558a;
    }
}
