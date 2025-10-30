package T1;

import Y7.InterfaceC0484z;
import a.AbstractC0485a;

/* loaded from: classes.dex */
public final class D extends G7.j implements O7.p {

    /* renamed from: r, reason: collision with root package name */
    public int f6980r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ G f6981s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Long f6982t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public D(G g9, Long l9, E7.d dVar) {
        super(2, dVar);
        this.f6981s = g9;
        this.f6982t = l9;
    }

    @Override // G7.a
    public final E7.d create(Object obj, E7.d dVar) {
        return new D(this.f6981s, this.f6982t, dVar);
    }

    @Override // O7.p
    public final Object invoke(Object obj, Object obj2) {
        return ((D) create((InterfaceC0484z) obj, (E7.d) obj2)).invokeSuspend(A7.n.f558a);
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        F7.a aVar = F7.a.f2587a;
        int i9 = this.f6980r;
        if (i9 != 0) {
            if (i9 == 1) {
                AbstractC0485a.A(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            AbstractC0485a.A(obj);
            long longValue = this.f6982t.longValue();
            this.f6980r = 1;
            if (this.f6981s.g(longValue, false, this) == aVar) {
                return aVar;
            }
        }
        return A7.n.f558a;
    }
}
