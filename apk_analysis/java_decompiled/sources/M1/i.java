package M1;

import Y7.InterfaceC0484z;
import a.AbstractC0485a;
import b8.AbstractC0714M;
import b8.C0709H;

/* loaded from: classes.dex */
public final class i extends G7.j implements O7.p {

    /* renamed from: r, reason: collision with root package name */
    public int f4717r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ n f4718s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(n nVar, E7.d dVar) {
        super(2, dVar);
        this.f4718s = nVar;
    }

    @Override // G7.a
    public final E7.d create(Object obj, E7.d dVar) {
        return new i(this.f4718s, dVar);
    }

    @Override // O7.p
    public final Object invoke(Object obj, Object obj2) {
        return ((i) create((InterfaceC0484z) obj, (E7.d) obj2)).invokeSuspend(A7.n.f558a);
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        F7.a aVar = F7.a.f2587a;
        int i9 = this.f4717r;
        if (i9 != 0) {
            if (i9 == 1) {
                AbstractC0485a.A(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            AbstractC0485a.A(obj);
            n nVar = this.f4718s;
            C0709H c0709h = new C0709H(nVar.h0().f4741e);
            h hVar = new h(nVar, null);
            this.f4717r = 1;
            if (AbstractC0714M.i(c0709h, hVar, this) == aVar) {
                return aVar;
            }
        }
        return A7.n.f558a;
    }
}
