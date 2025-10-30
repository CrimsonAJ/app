package m7;

import B7.y;
import O7.p;
import Y7.InterfaceC0484z;
import a.AbstractC0485a;
import b0.C0584b;
import b8.AbstractC0714M;
import b8.InterfaceC0725e;

/* loaded from: classes.dex */
public final class k extends G7.j implements p {

    /* renamed from: r, reason: collision with root package name */
    public n f20901r;

    /* renamed from: s, reason: collision with root package name */
    public int f20902s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ n f20903t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(n nVar, E7.d dVar) {
        super(2, dVar);
        this.f20903t = nVar;
    }

    @Override // G7.a
    public final E7.d create(Object obj, E7.d dVar) {
        return new k(this.f20903t, dVar);
    }

    @Override // O7.p
    public final Object invoke(Object obj, Object obj2) {
        return ((k) create((InterfaceC0484z) obj, (E7.d) obj2)).invokeSuspend(A7.n.f558a);
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        n nVar;
        F7.a aVar = F7.a.f2587a;
        int i9 = this.f20902s;
        if (i9 != 0) {
            if (i9 == 1) {
                nVar = this.f20901r;
                AbstractC0485a.A(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            AbstractC0485a.A(obj);
            n nVar2 = this.f20903t;
            InterfaceC0725e b9 = nVar2.f20916a.b();
            this.f20901r = nVar2;
            this.f20902s = 1;
            Object m9 = AbstractC0714M.m(b9, this);
            if (m9 == aVar) {
                return aVar;
            }
            nVar = nVar2;
            obj = m9;
        }
        n.a(nVar, new C0584b(y.I(((C0584b) obj).a()), true));
        return A7.n.f558a;
    }
}
