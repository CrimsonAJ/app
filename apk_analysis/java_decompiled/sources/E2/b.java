package E2;

import A7.n;
import C2.U;
import G7.j;
import O7.p;
import Y7.B;
import Y7.InterfaceC0484z;
import a.AbstractC0485a;

/* loaded from: classes.dex */
public final class b extends j implements p {

    /* renamed from: r, reason: collision with root package name */
    public int f1930r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ U f1931s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(U u9, E7.d dVar) {
        super(2, dVar);
        this.f1931s = u9;
    }

    @Override // G7.a
    public final E7.d create(Object obj, E7.d dVar) {
        return new b(this.f1931s, dVar);
    }

    @Override // O7.p
    public final Object invoke(Object obj, Object obj2) {
        return ((b) create((InterfaceC0484z) obj, (E7.d) obj2)).invokeSuspend(n.f558a);
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        F7.a aVar = F7.a.f2587a;
        int i9 = this.f1930r;
        if (i9 != 0) {
            if (i9 == 1) {
                AbstractC0485a.A(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            AbstractC0485a.A(obj);
            int i10 = X7.a.f8474d;
            long B9 = Z0.a.B(60L, X7.c.SECONDS);
            a aVar2 = new a(this.f1931s, null);
            this.f1930r = 1;
            if (B.D(B.z(B9), aVar2, this) == aVar) {
                return aVar;
            }
        }
        return n.f558a;
    }
}
