package g2;

import Y7.InterfaceC0484z;
import a.AbstractC0485a;

/* renamed from: g2.K, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1209K extends G7.j implements O7.p {

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ L2.x f17576r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ a0 f17577s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1209K(L2.x xVar, a0 a0Var, E7.d dVar) {
        super(2, dVar);
        this.f17576r = xVar;
        this.f17577s = a0Var;
    }

    @Override // G7.a
    public final E7.d create(Object obj, E7.d dVar) {
        return new C1209K(this.f17576r, this.f17577s, dVar);
    }

    @Override // O7.p
    public final Object invoke(Object obj, Object obj2) {
        C1209K c1209k = (C1209K) create((InterfaceC0484z) obj, (E7.d) obj2);
        A7.n nVar = A7.n.f558a;
        c1209k.invokeSuspend(nVar);
        return nVar;
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        AbstractC0485a.A(obj);
        this.f17576r.a(this.f17577s.f17637n);
        return A7.n.f558a;
    }
}
