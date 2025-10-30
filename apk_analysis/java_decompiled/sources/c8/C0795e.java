package c8;

import Y7.InterfaceC0484z;
import a.AbstractC0485a;
import b8.AbstractC0714M;
import b8.InterfaceC0726f;

/* renamed from: c8.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0795e extends G7.j implements O7.p {

    /* renamed from: r, reason: collision with root package name */
    public int f11754r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f11755s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0726f f11756t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ h f11757u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0795e(InterfaceC0726f interfaceC0726f, h hVar, E7.d dVar) {
        super(2, dVar);
        this.f11756t = interfaceC0726f;
        this.f11757u = hVar;
    }

    @Override // G7.a
    public final E7.d create(Object obj, E7.d dVar) {
        C0795e c0795e = new C0795e(this.f11756t, this.f11757u, dVar);
        c0795e.f11755s = obj;
        return c0795e;
    }

    @Override // O7.p
    public final Object invoke(Object obj, Object obj2) {
        return ((C0795e) create((InterfaceC0484z) obj, (E7.d) obj2)).invokeSuspend(A7.n.f558a);
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        F7.a aVar = F7.a.f2587a;
        int i9 = this.f11754r;
        A7.n nVar = A7.n.f558a;
        if (i9 != 0) {
            if (i9 == 1) {
                AbstractC0485a.A(obj);
                return nVar;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        AbstractC0485a.A(obj);
        InterfaceC0484z interfaceC0484z = (InterfaceC0484z) this.f11755s;
        h hVar = this.f11757u;
        int i10 = hVar.f11765b;
        if (i10 == -3) {
            i10 = -2;
        }
        Y7.A a5 = Y7.A.f8742c;
        O7.p c0796f = new C0796f(hVar, null);
        a8.q qVar = new a8.q(Y7.B.s(interfaceC0484z, hVar.f11764a), M4.a.a(i10, 4, hVar.f11766c));
        qVar.c0(a5, qVar, c0796f);
        this.f11754r = 1;
        Object k5 = AbstractC0714M.k(this.f11756t, qVar, true, this);
        if (k5 != aVar) {
            k5 = nVar;
        }
        if (k5 == aVar) {
            return aVar;
        }
        return nVar;
    }
}
