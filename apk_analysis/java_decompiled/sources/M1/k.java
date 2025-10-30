package M1;

import Y7.InterfaceC0484z;
import a.AbstractC0485a;
import b8.AbstractC0714M;
import b8.C0708G;

/* loaded from: classes.dex */
public final class k extends G7.j implements O7.p {

    /* renamed from: r, reason: collision with root package name */
    public int f4721r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ n f4722s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(n nVar, E7.d dVar) {
        super(2, dVar);
        this.f4722s = nVar;
    }

    @Override // G7.a
    public final E7.d create(Object obj, E7.d dVar) {
        return new k(this.f4722s, dVar);
    }

    @Override // O7.p
    public final Object invoke(Object obj, Object obj2) {
        return ((k) create((InterfaceC0484z) obj, (E7.d) obj2)).invokeSuspend(A7.n.f558a);
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        F7.a aVar = F7.a.f2587a;
        int i9 = this.f4721r;
        if (i9 != 0) {
            if (i9 == 1) {
                AbstractC0485a.A(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            AbstractC0485a.A(obj);
            n nVar = this.f4722s;
            C0708G c0708g = new C0708G(nVar.h0().f4740d);
            j jVar = new j(nVar, null);
            this.f4721r = 1;
            if (AbstractC0714M.i(c0708g, jVar, this) == aVar) {
                return aVar;
            }
        }
        return A7.n.f558a;
    }
}
