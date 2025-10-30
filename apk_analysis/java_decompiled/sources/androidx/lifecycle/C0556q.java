package androidx.lifecycle;

import Y7.C0463g0;
import Y7.InterfaceC0465h0;
import Y7.InterfaceC0484z;
import a.AbstractC0485a;

/* renamed from: androidx.lifecycle.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0556q extends G7.j implements O7.p {

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f9899r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ r f9900s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0556q(r rVar, E7.d dVar) {
        super(2, dVar);
        this.f9900s = rVar;
    }

    @Override // G7.a
    public final E7.d create(Object obj, E7.d dVar) {
        C0556q c0556q = new C0556q(this.f9900s, dVar);
        c0556q.f9899r = obj;
        return c0556q;
    }

    @Override // O7.p
    public final Object invoke(Object obj, Object obj2) {
        C0556q c0556q = (C0556q) create((InterfaceC0484z) obj, (E7.d) obj2);
        A7.n nVar = A7.n.f558a;
        c0556q.invokeSuspend(nVar);
        return nVar;
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        AbstractC0485a.A(obj);
        InterfaceC0484z interfaceC0484z = (InterfaceC0484z) this.f9899r;
        r rVar = this.f9900s;
        D.n nVar = rVar.f9901a;
        if (nVar.a0().compareTo(EnumC0555p.f9894b) >= 0) {
            nVar.V(rVar);
        } else {
            InterfaceC0465h0 interfaceC0465h0 = (InterfaceC0465h0) interfaceC0484z.g().get(C0463g0.f8811a);
            if (interfaceC0465h0 != null) {
                interfaceC0465h0.d(null);
            }
        }
        return A7.n.f558a;
    }
}
