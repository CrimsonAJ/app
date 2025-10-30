package M1;

import Y7.InterfaceC0484z;
import a.AbstractC0485a;
import b8.AbstractC0714M;
import b8.C0709H;

/* loaded from: classes.dex */
public final class y extends G7.j implements O7.p {

    /* renamed from: r, reason: collision with root package name */
    public int f4762r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ B f4763s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(E7.d dVar, B b9) {
        super(2, dVar);
        this.f4763s = b9;
    }

    @Override // G7.a
    public final E7.d create(Object obj, E7.d dVar) {
        return new y(dVar, this.f4763s);
    }

    @Override // O7.p
    public final Object invoke(Object obj, Object obj2) {
        return ((y) create((InterfaceC0484z) obj, (E7.d) obj2)).invokeSuspend(A7.n.f558a);
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        F7.a aVar = F7.a.f2587a;
        int i9 = this.f4762r;
        if (i9 != 0) {
            if (i9 == 1) {
                AbstractC0485a.A(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            AbstractC0485a.A(obj);
            B b9 = this.f4763s;
            C0709H c0709h = new C0709H(b9.r0().f4507u);
            x xVar = new x(null, b9);
            this.f4762r = 1;
            if (AbstractC0714M.i(c0709h, xVar, this) == aVar) {
                return aVar;
            }
        }
        return A7.n.f558a;
    }
}
