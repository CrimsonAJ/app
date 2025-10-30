package G0;

import Y7.InterfaceC0484z;
import a.AbstractC0485a;

/* renamed from: G0.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0144j extends G7.j implements O7.p {

    /* renamed from: r, reason: collision with root package name */
    public int f2769r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ C0145k f2770s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0144j(C0145k c0145k, E7.d dVar) {
        super(2, dVar);
        this.f2770s = c0145k;
    }

    @Override // G7.a
    public final E7.d create(Object obj, E7.d dVar) {
        return new C0144j(this.f2770s, dVar);
    }

    @Override // O7.p
    public final Object invoke(Object obj, Object obj2) {
        return ((C0144j) create((InterfaceC0484z) obj, (E7.d) obj2)).invokeSuspend(A7.n.f558a);
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        Object e8;
        F7.a aVar = F7.a.f2587a;
        int i9 = this.f2769r;
        A7.n nVar = A7.n.f558a;
        if (i9 != 0) {
            if (i9 == 1) {
                AbstractC0485a.A(obj);
                return nVar;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        AbstractC0485a.A(obj);
        this.f2769r = 1;
        C0145k c0145k = this.f2770s;
        E e9 = c0145k.f2771a;
        if ((e9.l() && !e9.o()) || (e8 = c0145k.f2773c.e(this)) != aVar) {
            e8 = nVar;
        }
        if (e8 == aVar) {
            return aVar;
        }
        return nVar;
    }
}
