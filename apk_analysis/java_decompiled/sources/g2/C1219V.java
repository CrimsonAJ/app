package g2;

import Y7.InterfaceC0484z;
import a.AbstractC0485a;
import co.notix.R;
import java.util.List;

/* renamed from: g2.V, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1219V extends G7.j implements O7.p {

    /* renamed from: r, reason: collision with root package name */
    public int f17609r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ a0 f17610s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1219V(a0 a0Var, E7.d dVar) {
        super(2, dVar);
        this.f17610s = a0Var;
    }

    @Override // G7.a
    public final E7.d create(Object obj, E7.d dVar) {
        return new C1219V(this.f17610s, dVar);
    }

    @Override // O7.p
    public final Object invoke(Object obj, Object obj2) {
        return ((C1219V) create((InterfaceC0484z) obj, (E7.d) obj2)).invokeSuspend(A7.n.f558a);
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        F7.a aVar = F7.a.f2587a;
        int i9 = this.f17609r;
        A7.n nVar = A7.n.f558a;
        if (i9 != 0) {
            if (i9 == 1) {
                AbstractC0485a.A(obj);
                return nVar;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        AbstractC0485a.A(obj);
        a0 a0Var = this.f17610s;
        H2.u a5 = a0Var.f17634k.a();
        if (a5 == null) {
            M1.D d9 = new M1.D(R.string.msg_unknown_error);
            this.f17609r = 1;
            if (a0Var.e(d9, this) == aVar) {
                return aVar;
            }
            return nVar;
        }
        int i10 = a5.f3071g;
        List list = a5.f3072h;
        a0Var.k(i10, a5.f3065a, a5.f3066b, a5.f3068d, a5.f3069e, list);
        return nVar;
    }
}
