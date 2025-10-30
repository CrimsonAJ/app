package T1;

import Y7.InterfaceC0484z;
import a.AbstractC0485a;

/* loaded from: classes.dex */
public final class F extends G7.j implements O7.p {

    /* renamed from: r, reason: collision with root package name */
    public int f6987r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ G f6988s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ boolean f6989t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public F(G g9, boolean z9, E7.d dVar) {
        super(2, dVar);
        this.f6988s = g9;
        this.f6989t = z9;
    }

    @Override // G7.a
    public final E7.d create(Object obj, E7.d dVar) {
        return new F(this.f6988s, this.f6989t, dVar);
    }

    @Override // O7.p
    public final Object invoke(Object obj, Object obj2) {
        return ((F) create((InterfaceC0484z) obj, (E7.d) obj2)).invokeSuspend(A7.n.f558a);
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        F7.a aVar = F7.a.f2587a;
        int i9 = this.f6987r;
        if (i9 != 0) {
            if (i9 == 1) {
                AbstractC0485a.A(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            AbstractC0485a.A(obj);
            G g9 = this.f6988s;
            g9.f6998o = this.f6989t;
            long j = g9.f6995l.f3444a;
            this.f6987r = 1;
            if (g9.g(j, true, this) == aVar) {
                return aVar;
            }
        }
        return A7.n.f558a;
    }
}
