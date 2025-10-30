package G0;

import Y7.InterfaceC0484z;
import a.AbstractC0485a;

/* loaded from: classes.dex */
public final class Q extends G7.j implements O7.p {

    /* renamed from: r, reason: collision with root package name */
    public int f2690r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ X f2691s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ C0141g f2692t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Q(X x5, C0141g c0141g, E7.d dVar) {
        super(2, dVar);
        this.f2691s = x5;
        this.f2692t = c0141g;
    }

    @Override // G7.a
    public final E7.d create(Object obj, E7.d dVar) {
        return new Q(this.f2691s, this.f2692t, dVar);
    }

    @Override // O7.p
    public final Object invoke(Object obj, Object obj2) {
        return ((Q) create((InterfaceC0484z) obj, (E7.d) obj2)).invokeSuspend(A7.n.f558a);
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        F7.a aVar = F7.a.f2587a;
        int i9 = this.f2690r;
        C0141g c0141g = this.f2692t;
        try {
            if (i9 != 0) {
                if (i9 == 1) {
                    AbstractC0485a.A(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                AbstractC0485a.A(obj);
                X x5 = this.f2691s;
                this.f2690r = 1;
                obj = X.b(x5, this);
                if (obj == aVar) {
                    return aVar;
                }
            }
            c0141g.invoke();
            return A7.n.f558a;
        } catch (Throwable th) {
            c0141g.invoke();
            throw th;
        }
    }
}
