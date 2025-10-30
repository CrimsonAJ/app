package I0;

import Y7.C0473n;
import Y7.InterfaceC0484z;
import a.AbstractC0485a;

/* loaded from: classes.dex */
public final class u extends G7.j implements O7.p {

    /* renamed from: r, reason: collision with root package name */
    public int f3271r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ C0473n f3272s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(C0473n c0473n, E7.d dVar) {
        super(2, dVar);
        this.f3272s = c0473n;
    }

    @Override // G7.a
    public final E7.d create(Object obj, E7.d dVar) {
        return new u(this.f3272s, dVar);
    }

    @Override // O7.p
    public final Object invoke(Object obj, Object obj2) {
        return ((u) create((InterfaceC0484z) obj, (E7.d) obj2)).invokeSuspend(A7.n.f558a);
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        F7.a aVar = F7.a.f2587a;
        int i9 = this.f3271r;
        if (i9 != 0) {
            if (i9 == 1) {
                AbstractC0485a.A(obj);
                return obj;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        AbstractC0485a.A(obj);
        this.f3271r = 1;
        Object o9 = this.f3272s.o(this);
        if (o9 == aVar) {
            return aVar;
        }
        return o9;
    }
}
