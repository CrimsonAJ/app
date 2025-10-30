package g2;

import Y7.InterfaceC0484z;
import a.AbstractC0485a;

/* renamed from: g2.Y, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1222Y extends G7.j implements O7.p {

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ a0 f17621r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1222Y(a0 a0Var, E7.d dVar) {
        super(2, dVar);
        this.f17621r = a0Var;
    }

    @Override // G7.a
    public final E7.d create(Object obj, E7.d dVar) {
        return new C1222Y(this.f17621r, dVar);
    }

    @Override // O7.p
    public final Object invoke(Object obj, Object obj2) {
        C1222Y c1222y = (C1222Y) create((InterfaceC0484z) obj, (E7.d) obj2);
        A7.n nVar = A7.n.f558a;
        c1222y.invokeSuspend(nVar);
        return nVar;
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        AbstractC0485a.A(obj);
        a0 a0Var = this.f17621r;
        a0Var.f17636m.a(a0Var.f17645v);
        return A7.n.f558a;
    }
}
