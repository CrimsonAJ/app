package C2;

import Y7.InterfaceC0484z;
import Y7.y0;
import a.AbstractC0485a;
import v2.C2101a;
import v2.C2102b;

/* loaded from: classes.dex */
public final class V extends G7.j implements O7.p {

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ long f1301r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ long f1302s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ int f1303t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ g0 f1304u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public V(int i9, long j, long j4, g0 g0Var, E7.d dVar) {
        super(2, dVar);
        this.f1301r = j;
        this.f1302s = j4;
        this.f1303t = i9;
        this.f1304u = g0Var;
    }

    @Override // G7.a
    public final E7.d create(Object obj, E7.d dVar) {
        return new V(this.f1303t, this.f1301r, this.f1302s, this.f1304u, dVar);
    }

    @Override // O7.p
    public final Object invoke(Object obj, Object obj2) {
        return ((V) create((InterfaceC0484z) obj, (E7.d) obj2)).invokeSuspend(A7.n.f558a);
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        AbstractC0485a.A(obj);
        if (this.f1301r >= 0 && this.f1302s >= 0 && this.f1303t >= 0) {
            g0 g0Var = this.f1304u;
            y0 y0Var = g0Var.f1362d;
            if (y0Var != null) {
                y0Var.d(null);
            }
            g0Var.f1362d = Y7.B.r(g0Var.f1361c, Y7.K.f8774b, new E2.b(new U(this.f1303t, this.f1301r, this.f1302s, g0Var, null), null), 2);
            return new C2102b(A7.n.f558a);
        }
        return new C2101a(new S5.b((String) null, (Throwable) null));
    }
}
