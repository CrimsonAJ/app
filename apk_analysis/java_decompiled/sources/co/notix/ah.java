package co.notix;

import Y7.InterfaceC0484z;
import a.AbstractC0485a;
import b8.C0704C;
import b8.InterfaceC0716O;
import b8.InterfaceC0725e;
import c8.AbstractC0793c;

/* loaded from: classes.dex */
public final class ah extends G7.j implements O7.p {

    /* renamed from: a, reason: collision with root package name */
    public int f11849a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ch f11850b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ah(ch chVar, E7.d dVar) {
        super(2, dVar);
        this.f11850b = chVar;
    }

    @Override // G7.a
    public final E7.d create(Object obj, E7.d dVar) {
        return new ah(this.f11850b, dVar);
    }

    @Override // O7.p
    public final Object invoke(Object obj, Object obj2) {
        return ((ah) create((InterfaceC0484z) obj, (E7.d) obj2)).invokeSuspend(A7.n.f558a);
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        F7.a aVar = F7.a.f2587a;
        int i9 = this.f11849a;
        A7.n nVar = A7.n.f558a;
        if (i9 != 0) {
            if (i9 == 1) {
                AbstractC0485a.A(obj);
                return nVar;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        AbstractC0485a.A(obj);
        InterfaceC0716O interfaceC0716O = (InterfaceC0716O) this.f11850b.f12025c.f12707c.getValue();
        ch chVar = this.f11850b;
        InterfaceC0716O interfaceC0716O2 = ((ra) chVar.f12031i).f13096e;
        zg zgVar = new zg(chVar, null);
        this.f11849a = 1;
        Object a5 = AbstractC0793c.a(this, new C0704C(zgVar, (E7.d) null), c8.x.f11808a, new InterfaceC0725e[]{interfaceC0716O, interfaceC0716O2});
        if (a5 != aVar) {
            a5 = nVar;
        }
        if (a5 != aVar) {
            a5 = nVar;
        }
        if (a5 == aVar) {
            return aVar;
        }
        return nVar;
    }
}
