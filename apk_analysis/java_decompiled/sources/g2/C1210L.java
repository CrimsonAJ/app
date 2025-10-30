package g2;

import Y7.InterfaceC0484z;
import a.AbstractC0485a;

/* renamed from: g2.L, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1210L extends G7.j implements O7.p {

    /* renamed from: r, reason: collision with root package name */
    public int f17578r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ L2.x f17579s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ a0 f17580t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1210L(L2.x xVar, a0 a0Var, E7.d dVar) {
        super(2, dVar);
        this.f17579s = xVar;
        this.f17580t = a0Var;
    }

    @Override // G7.a
    public final E7.d create(Object obj, E7.d dVar) {
        return new C1210L(this.f17579s, this.f17580t, dVar);
    }

    @Override // O7.p
    public final Object invoke(Object obj, Object obj2) {
        return ((C1210L) create((InterfaceC0484z) obj, (E7.d) obj2)).invokeSuspend(A7.n.f558a);
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        F7.a aVar = F7.a.f2587a;
        int i9 = this.f17578r;
        if (i9 != 0) {
            if (i9 == 1) {
                AbstractC0485a.A(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            AbstractC0485a.A(obj);
            f8.d dVar = Y7.K.f8774b;
            C1209K c1209k = new C1209K(this.f17579s, this.f17580t, null);
            this.f17578r = 1;
            if (Y7.B.C(dVar, c1209k, this) == aVar) {
                return aVar;
            }
        }
        return A7.n.f558a;
    }
}
