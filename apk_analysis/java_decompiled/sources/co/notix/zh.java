package co.notix;

import a.AbstractC0485a;

/* loaded from: classes.dex */
public final class zh extends G7.j implements O7.l {

    /* renamed from: a, reason: collision with root package name */
    public int f13682a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ di f13683b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f13684c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zh(di diVar, String str, E7.d dVar) {
        super(1, dVar);
        this.f13683b = diVar;
        this.f13684c = str;
    }

    @Override // G7.a
    public final E7.d create(E7.d dVar) {
        return new zh(this.f13683b, this.f13684c, dVar);
    }

    @Override // O7.l
    public final Object invoke(Object obj) {
        return ((zh) create((E7.d) obj)).invokeSuspend(A7.n.f558a);
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        F7.a aVar = F7.a.f2587a;
        int i9 = this.f13682a;
        if (i9 != 0) {
            if (i9 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC0485a.A(obj);
            return obj;
        }
        AbstractC0485a.A(obj);
        di diVar = this.f13683b;
        String str = this.f13684c;
        this.f13682a = 1;
        Object a5 = diVar.a(str, this);
        return a5 == aVar ? aVar : a5;
    }
}
